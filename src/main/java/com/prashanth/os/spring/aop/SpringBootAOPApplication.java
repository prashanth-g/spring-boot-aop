package com.prashanth.os.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootAOPApplication implements CommandLineRunner {

  @Autowired
  Message message;

  @Autowired
  ConfigurableApplicationContext configurableApplicationContext;

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAOPApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    message.show();
    System.exit(SpringApplication.exit(configurableApplicationContext));
  }
}
