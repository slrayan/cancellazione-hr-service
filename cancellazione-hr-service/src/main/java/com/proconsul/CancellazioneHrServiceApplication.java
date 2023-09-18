package com.proconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CancellazioneHrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CancellazioneHrServiceApplication.class, args);
	}

}
