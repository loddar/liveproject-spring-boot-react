package com.github.loddar.liveprojectspringbootreact.salonapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalonApiApplication.class, args);
	}

	@Bean
	@ConfigurationProperties(prefix = "salon.detail")
	SalonDetail salonDetail() {
		return new SalonDetail();
	}

}
