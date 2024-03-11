package com.hkbusiness.africanfoodserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AfricanFoodServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfricanFoodServiceRegistryApplication.class, args);
	}

}
