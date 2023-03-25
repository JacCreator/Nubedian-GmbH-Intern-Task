package com.webapp.cpudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.webapp.cpudemo.repository")
@EntityScan("com.webapp.cpudemo.model")
public class CpudemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpudemoApplication.class, args);
	}

}
