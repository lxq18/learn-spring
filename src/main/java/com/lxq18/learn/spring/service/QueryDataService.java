package com.lxq18.learn.spring.service;

import com.lxq18.learn.spring.model.QueryData;
import com.lxq18.learn.spring.model.QueryParam;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 9:09
 */
public interface QueryDataService {
    QueryData query(QueryParam param);
}
