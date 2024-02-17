package com.leticiacampos.rhworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RecursoshumanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecursoshumanosApplication.class, args);
	}

}
