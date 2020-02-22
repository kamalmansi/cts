package com.vp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class AngMicroSerMySqlClientApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(AngMicroSerMySqlClientApp1Application.class, args);
	}

}
