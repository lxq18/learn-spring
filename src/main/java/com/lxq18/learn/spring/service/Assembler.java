package com.lxq18.learn.spring.service;

import com.lxq18.learn.spring.model.*;

public interface Assembler {
    boolean match(Card from, RequestParam requestParam);

    void extractParam(Card from, QueryParam queryParam);

    CardDTO assemble(Card from, QueryParam param, QueryData queryData);
}
