package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.model.Card;
import com.lxq18.learn.spring.model.CardDTO;
import com.lxq18.learn.spring.service.FieldCopier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 组装处理之后的字段拷贝器
 *
 * @author lixiaoqiang
 * @create 2020/8/8 10:00
 */
@Slf4j
@Component
public class AfterAssembleFieldCopier implements FieldCopier<Card, CardDTO> {
    @Override
    public void copy(Card from, CardDTO target) {
        log.info("after copy field: name = " + from.getId());
        target.setName(from.getName());
    }
}
