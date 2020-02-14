package com.ddbuy.service.Impl;

import com.ddbuy.service.Test;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Author caoqian
 * @ClassName TestImplService  此接口作为dubbo服务接口实现类 仅作为测试
 * @Date 2020/2/14 21:39
 * @Version 1.0
 */
@Service(interfaceClass = Test.class)//发布服务
@Component
public class TestImplService implements Test {
    @Override
    public String getMsg() {
        return "helloWord";
    }
}
