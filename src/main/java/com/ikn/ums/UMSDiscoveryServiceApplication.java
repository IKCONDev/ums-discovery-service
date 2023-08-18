package com.ikn.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UMSDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UMSDiscoveryServiceApplication.class, args);
	}

}
