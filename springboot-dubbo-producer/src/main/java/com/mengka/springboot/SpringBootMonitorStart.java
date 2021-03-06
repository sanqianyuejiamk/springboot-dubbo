package com.mengka.springboot;

import com.mengka.cloud.proxy.EnableMengkaProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import com.mengka.cloud.config.mcservice.BeanScannerConfigurer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA
 * User: huangyy
 * Date: 2016/11/26
 * Time: 13:36
 */
@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.mengka.cloud.config.mcservice")
//@Import(BeanScannerConfigurer.class)
@EnableMengkaProxy
@PropertySource("classpath:/properties/datasource.properties")
@ImportResource("classpath:/spring/applicationContext.xml")
public class SpringBootMonitorStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMonitorStart.class, args);
    }
}
