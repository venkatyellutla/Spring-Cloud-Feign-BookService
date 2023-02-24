package com.springcloud.feign.bookService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudFeignBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignBookServiceApplication.class, args);
	}

}
