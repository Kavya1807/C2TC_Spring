package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sample.SpringComponent;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBootdemoApplication.class, args);
		SpringComponent sc = ac.getBean("springComponent", SpringComponent.class);
		System.out.println(sc.getMessage());
	}

}
