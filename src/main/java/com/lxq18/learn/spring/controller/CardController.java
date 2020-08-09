package com.lxq18.learn.spring.controller;

import com.lxq18.learn.spring.impl.service.AssemblerManager;
import com.lxq18.learn.spring.model.Card;
import com.lxq18.learn.spring.model.CardDTO;
import com.lxq18.learn.spring.model.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 8:45
 */
@RestController
public class CardController {
    @Autowired
    private AssemblerManager assemblerManager;

    @RequestMapping("/cardList")
    public List<CardDTO> cardList() {
        List<Card> fromCards = Arrays.asList(
                new Card("doc1", "docName1"),
                new Card("photoset1", "photosetName1"),
                new Card("video1", "videoName1"),
                new Card("special1", "specialName1")
        );
        return assemblerManager.assemble(fromCards, new RequestParam());
    }
}
