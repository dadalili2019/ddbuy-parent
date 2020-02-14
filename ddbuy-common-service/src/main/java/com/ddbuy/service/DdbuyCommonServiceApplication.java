package com.ddbuy.service;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration  //启动Dubbo
@MapperScan("com.ddbuy.mapper") //开启mybatis接口扫描
public class DdbuyCommonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdbuyCommonServiceApplication.class, args);
    }

}
