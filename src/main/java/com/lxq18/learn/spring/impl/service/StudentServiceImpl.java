package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class StudentServiceImpl implements StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public void study() {
        logger.info("i am studying");
    }
}
