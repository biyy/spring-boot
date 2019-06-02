package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author byy
 * @SpringBootApplication 标注一个主程序类,说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class MyspringApplication {

  public static void main(String[] args) {
    //Spring应用启动起来
    SpringApplication.run(MyspringApplication.class, args);
  }

}
