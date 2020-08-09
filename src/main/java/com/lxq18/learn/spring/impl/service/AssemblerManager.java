package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.model.Card;
import com.lxq18.learn.spring.model.CardDTO;
import com.lxq18.learn.spring.model.RequestParam;

import java.util.List;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 8:40
 */
public interface AssemblerManager {
    List<CardDTO> assemble(List<Card> fromCards, RequestParam param);
}
