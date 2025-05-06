package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 加载Spring配置
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        // 获取UserService
        UserService userService = context.getBean(UserService.class);

        // 测试登录
        boolean result = userService.login("admin", "123456");
        System.out.println("登录结果：" + result);
    }
}