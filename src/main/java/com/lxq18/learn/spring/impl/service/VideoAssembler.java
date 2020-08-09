package com.lxq18.learn.spring.impl.service;

import com.lxq18.learn.spring.model.*;
import com.lxq18.learn.spring.service.AbstractAssembler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author lixiaoqiang
 * @create 2020/8/8 8:52
 */
@Slf4j
@Component
public class VideoAssembler extends AbstractAssembler<VideoCardDTO> {
    @Override
    public boolean match(Card from, RequestParam requestParam) {
        boolean result = from.getId().startsWith("video");
        if (!result) {
            log.info("video not match");
        }
        return result;
    }

    @Override
    public void extractParam(Card from, QueryParam queryParam) {
        log.info("video extractParam");
    }

    @Override
    protected VideoCardDTO buildCard() {
        return new VideoCardDTO();
    }

    @Override
    protected void doAssemble(Card from, VideoCardDTO to, QueryParam param, QueryData queryData) {
        log.info("video assemble success");
    }
}
