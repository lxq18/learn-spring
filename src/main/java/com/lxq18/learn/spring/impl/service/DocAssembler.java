package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.model.*;
import com.lxq18.learn.spring.service.AbstractAssembler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 8:52
 */
@Slf4j
@Component
public class DocAssembler extends AbstractAssembler<CardDTO> {
    @Override
    public boolean match(Card from, RequestParam param) {
        boolean result = from.getId().startsWith("doc");
        if (!result) {
            log.info("doc not match");
        }
        return result;
    }

    @Override
    public void extractParam(Card from, QueryParam queryParam) {
        log.info("doc extractParam");
    }

    @Override
    protected CardDTO buildCard() {
        return new CardDTO();
    }

    @Override
    public void doAssemble(Card from, CardDTO target, QueryParam param, QueryData queryData) {
        log.info("doc assemble success");
    }

}
