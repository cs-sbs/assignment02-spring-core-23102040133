package org.example;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Before("execution(* UserService.login(..))")
    public void beforeLogin() {
        System.out.println("有人尝试登录...");
    }
}