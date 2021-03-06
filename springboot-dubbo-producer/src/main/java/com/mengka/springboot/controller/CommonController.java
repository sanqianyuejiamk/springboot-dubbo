package com.mengka.springboot.controller;

import com.mengka.springboot.dao.persistence.BookDOMapper;
import com.mengka.springboot.service.MengkaCloudMcService;
//import com.mengka.springboot.service.MengkaCloudWechatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangyy
 * @description
 * @data 2017/02/19.
 */
@Slf4j
@Controller
@RequestMapping("/v1")
public class CommonController {

    @Autowired
    private BookDOMapper bookDOMapper;

//    @Autowired
//    private MengkaCloudWechatService mengkaCloudWechatService;

    @Autowired
    private MengkaCloudMcService mengkaCloudMcService;

    @RequestMapping("/rate")
    public String product(Model model){
        log.info("freeMarkerController index......");

        model.addAttribute("baicai","a11");
        model.addAttribute("qingcai","b11");
        return "views/index";
    }

    @RequestMapping("/rate2")
    public String product2(Model model){
        log.info("freeMarkerController index......");

//        mengkaCloudWechatService.helloworld();


        String result = mengkaCloudMcService.helloworld();
        log.info("result = {}",result);

        return "index2";
    }
}
