package com.lxq18.learn.spring.model;

import lombok.Data;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 8:35
 */
@Data
public class Card {
    private String id;
    private String name;
    private Integer age;

    public Card(String id) {
        this.id = id;
    }

    public Card(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
