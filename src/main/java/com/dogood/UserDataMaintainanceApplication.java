package com.dogood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class UserDataMaintainanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDataMaintainanceApplication.class, args);
	}

}
