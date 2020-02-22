package com.vp;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;
import com.vp.component.StudentComponent;
import com.vp.model.StudentGateway;



@EnableDiscoveryClient
@RestController
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AngMicroSerMySqlGatewayApp1Application {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;
	
	@Autowired
	private StudentComponent studentComponent;
	
	public static void main(String[] args) {
		SpringApplication.run(AngMicroSerMySqlGatewayApp1Application.class, args);
	}
	
	@RequestMapping("/students")
	public String getStudents() throws URISyntaxException{
		return studentComponent.getOtherServiceAllStudentJPA();
			
	}

	
	@PostMapping("/student")
	public void postStudent(@RequestBody StudentGateway studentGateway) throws URISyntaxException{
		
		studentComponent.postStudent(studentGateway);
		
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
		
	}
	
}
