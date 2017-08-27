package com.mengka.springboot.service;

import com.mengka.cloud.config.annotation.McService;
import com.mengka.springboot.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import java.util.Date;

/**
 * @author mengka
 * @date 2017/08/27.
 */
@Slf4j
@McService
public class MengkaCloudMcService {

    public String helloworld(){
        String result = "just for test["+ TimeUtil.toDate(new Date(),TimeUtil.FORMAT_YYYY_MM_DD_HH_MM_SS);
        log.info("MengkaCloudMcService helloworld result = {}",result);
        return result;
    }
}
