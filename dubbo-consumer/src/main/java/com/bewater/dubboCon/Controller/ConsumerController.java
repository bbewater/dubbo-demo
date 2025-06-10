package com.bewater.dubboCon.Controller;

import com.bewater.dubboApi.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: dubbo-demo
 * Description: 描述这个文件的作用
 *
 * @Author: zhoudun
 * @Date: 2025/6/10
 */
@RestController
public class ConsumerController {
    @DubboReference
    private UserService userService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return userService.sayHello();
    }
}
