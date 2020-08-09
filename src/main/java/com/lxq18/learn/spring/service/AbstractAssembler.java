package com.lxq18.learn.spring.service;

import com.lxq18.learn.spring.model.*;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 8:38
 */
@Slf4j
public abstract class AbstractAssembler<T extends CardDTO> implements Assembler {
    @Resource(name = "beforeAssembleFieldCopier")
    private FieldCopier beforeAssembleFieldCopier;

    @Resource(name = "afterAssembleFieldCopier")
    private FieldCopier afterAssembleFieldCopier;

    public abstract boolean match(Card from, RequestParam requestParam);

    public void extractParam(Card from, QueryParam queryParam) {
        //default do nothing
    }

    @Override
    public CardDTO assemble(Card from, QueryParam param, QueryData queryData) {
        log.info("assemble  start");
        T to = buildCard();
        if (to == null) {
            log.error("create cardDTO null");
            return null;
        }
        beforeAssembleFieldCopier.copy(from, to);
        doAssemble(from, to, param, queryData);
        afterAssembleFieldCopier.copy(from, to);

        log.info("assemble  end");
        return to;
    }

    protected abstract T buildCard();

    protected abstract void doAssemble(Card from, T to, QueryParam param, QueryData queryData);
}
