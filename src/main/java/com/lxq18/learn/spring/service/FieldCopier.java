package com.lxq18.learn.spring.service;

/**
 * 字段复制器
 *
 * @author lixiaoqiang
 * @create 2020/8/8 9:58
 */
public interface FieldCopier<F, T> {
    void copy(F from, T target);
}
