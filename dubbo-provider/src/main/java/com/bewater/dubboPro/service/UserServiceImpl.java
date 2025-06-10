package com.bewater.dubboPro.service;

import com.bewater.dubboApi.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * Project: dubbo-demo
 * Description: 描述这个文件的作用
 *
 * @Author: zhoudun
 * @Date: 2025/6/10
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "hello i am dubbo provider";
    }
}
