package com.vp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class AngMicroSerMySqlServerApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(AngMicroSerMySqlServerApp1Application.class, args);
	}

}
