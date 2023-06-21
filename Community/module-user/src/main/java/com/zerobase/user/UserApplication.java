package com.zerobase.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.zerobase")
@EntityScan(basePackages = "com.zerobase.common")
@EnableJpaRepositories(basePackages = "com.zerobase.common")
//@EnableJpaAuditing
public class UserApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
