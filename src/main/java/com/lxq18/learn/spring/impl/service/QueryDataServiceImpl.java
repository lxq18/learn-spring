package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.model.QueryData;
import com.lxq18.learn.spring.model.QueryParam;
import com.lxq18.learn.spring.service.QueryDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 9:10
 */
@Slf4j
@Service
public class QueryDataServiceImpl implements QueryDataService {
    @Override
    public QueryData query(QueryParam param) {
        log.info("parallel query data success");
        return new QueryData();
    }
}
