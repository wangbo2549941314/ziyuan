package com.ysd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* @MapperScan("com.ysd.demo.dao") //扫描mapper接口,相当于dao接口mapper里面的@Mapper*/ 

public class ZiyuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZiyuanApplication.class, args);
	}

}
