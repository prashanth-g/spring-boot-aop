package com.prashanth.os.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomAspect {

  @Pointcut("execution(public void com.prashanth.os.spring.aop.Message.show())")
  public void randomPointCut(){}

  @Before("randomPointCut()")
  public void before() {
    System.out.println("Calling before !");
  }
}
