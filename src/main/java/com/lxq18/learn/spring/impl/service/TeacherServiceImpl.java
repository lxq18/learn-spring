package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.service.TeacherService;
import lombok.Data;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class TeacherServiceImpl implements TeacherService {
    private static final Logger logger = LoggerFactory.getLogger(TeacherServiceImpl.class);

    private String name;
    private int age;

    @Override
    public void teach() {
        logger.info("i am teaching");
    }
}
