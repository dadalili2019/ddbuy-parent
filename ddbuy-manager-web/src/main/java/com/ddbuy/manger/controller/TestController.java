package com.ddbuy.manger.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ddbuy.service.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author caoqian
 * @ClassName TestController  此类作为消费者方控制器
 * @Date 2020/2/14 21:44
 * @Version 1.0
 */
@Controller
public class TestController {

    @Reference(interfaceClass = Test.class,check = false)
    private Test test;

    @RequestMapping("/getData")
    @ResponseBody
    public String getData(){
        //调用远程服务
        return test.getMsg();
    }
}
