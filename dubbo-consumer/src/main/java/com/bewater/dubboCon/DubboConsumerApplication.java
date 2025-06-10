package com.bewater.dubboCon;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Project: dubbo-demo
 * Description: 描述这个文件的作用
 *
 * @Author: zhoudun
 * @Date: 2025/6/10
 */
@SpringBootApplication
@EnableDubbo
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
