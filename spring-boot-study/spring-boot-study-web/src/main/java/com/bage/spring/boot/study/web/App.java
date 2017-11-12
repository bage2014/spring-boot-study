package com.bage.spring.boot.study.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.bage.spring.boot.study.web" }) 	/* 配置扫描包 */
public class App implements CommandLineRunner {
    
	public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }
    
	public void run(String... args) throws Exception {
		System.out.println("App.run is work");
	}
}
