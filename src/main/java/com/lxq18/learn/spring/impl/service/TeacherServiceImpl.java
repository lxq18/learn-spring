package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeacherServiceImpl implements TeacherService {
    private static final Logger logger = LoggerFactory.getLogger(TeacherServiceImpl.class);

    @Override
    public void teach() {
        logger.info("i am teaching");
    }
}
