package com.prashanth.os.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Message {

  public void show() {
    System.out.println("I am showing message!");
  }
}
