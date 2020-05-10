package com.lxq18.learn.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxq
 * @create 2019/8/10 0:54
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String helloWorld() {
        return "hello world!";
    }
}
