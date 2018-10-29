package com.javabase.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动的入口.
 */

//com.javabase.*.dao 必须要这样的写法;如果写成:com.*.dao 的话,是不能被加载的; 或者:com.javabase.*
@MapperScan(basePackages = "com.javabase.*.dao")
@SpringBootApplication
public class BootApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApiDemoApplication.class, args);
	}
}

