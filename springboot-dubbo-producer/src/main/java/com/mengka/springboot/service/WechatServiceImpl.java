package com.mengka.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mengka.cloud.service.WechatService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author mengka
 * @date 2017/08/24.
 */
@Slf4j
@Service(version = "1.0.0", group = "test", retries = 2)
public class WechatServiceImpl implements WechatService {

    /**
     * 发送微信消息
     *
     * @param userId
     * @param content
     */
    public void sendMessage(String userId, String content) {
        log.info("WechatService sendMessage content = {}", content);
    }
}
