package com.vp;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication

@EnableEurekaServer
public 

class SbMicroserviceApplication {

	
public static void main(String[] args) {
		
SpringApplication.run(SbMicroserviceApplication.class, args);
	
}


}
