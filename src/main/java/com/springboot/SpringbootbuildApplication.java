package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot")
public class SpringbootbuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbuildApplication.class, args);
	}
}
