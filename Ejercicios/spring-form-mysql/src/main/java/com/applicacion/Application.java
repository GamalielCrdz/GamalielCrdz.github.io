package com.applicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("applicacion")
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(Application.class, args);

	}

}
