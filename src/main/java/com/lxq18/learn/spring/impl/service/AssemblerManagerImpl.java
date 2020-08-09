package com.lxq18.learn.spring.impl.service;

import com.alibaba.fastjson.JSON;
import com.lxq18.learn.spring.model.*;
import com.lxq18.learn.spring.service.Assembler;
import com.lxq18.learn.spring.service.QueryDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 8:43
 */
@Slf4j
@Component
public class AssemblerManagerImpl implements AssemblerManager {

    private List<Assembler> assemblers;
    @Autowired
    private QueryDataService queryDataService;

    @PostConstruct
    public void init() {
        assemblers = new ArrayList<>();
        assemblers.add(videoAssembler);
        assemblers.add(photosetAssembler);
        assemblers.add(docAssembler);
    }

    @Override
    public List<CardDTO> assemble(List<Card> fromCards, RequestParam requestParam) {
        List<CardDTO> result = new ArrayList<>();

        //抽取查询所需ID
        QueryParam queryParam = buildQueryParam(fromCards, requestParam);

        //查询依赖数据
        QueryData queryData = queryDataService.query(queryParam);

        //组装
        fromCards.forEach(card -> result.add(buidCardDTO(card, requestParam, queryParam, queryData)));

        return result;
    }

    private CardDTO buidCardDTO(Card card, RequestParam requestParam, QueryParam queryParam, QueryData queryData) {
        for (Assembler assembler : assemblers) {
            if (assembler.match(card, requestParam)) {
                //一旦找到组装器，则不会执行其他组装器，避免处理散落在多个组装器中造成处理混乱
                return assembler.assemble(card, queryParam, queryData);
            }
        }

        log.error("not find mapped assembler, card = " + card);
        return null;
    }

    private QueryParam buildQueryParam(List<Card> fromCards, RequestParam requestParam) {
        QueryParam queryParam = new QueryParam();
        queryParam.setRequestParam(requestParam);
        fromCards.forEach(card -> assemblers.forEach(assembler -> {
            if (assembler.match(card, requestParam)) {
                assembler.extractParam(card, queryParam);
            }
        }));
        return queryParam;
    }

    @Autowired
    private Assembler videoAssembler;
    @Autowired
    private Assembler docAssembler;
    @Autowired
    private Assembler photosetAssembler;
}
