package com.mengka.springboot.manager;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mengka.cloud.service.WechatService;
import com.mengka.springboot.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * @author mengka
 * @date 2017/08/24.
 */
@Slf4j
@Service
public class WechatManager {

    @Reference(version = "1.0.0")
    private WechatService wechatService;

    public void sendMessage(){
        wechatService.sendMessage("044101331","juse for test["+ TimeUtil.toDate(new Date(),TimeUtil.FORMAT_YYYY_MM_DD_HH_MM_SS));
        log.info("WechatManager sendMessage.");
    }
}
