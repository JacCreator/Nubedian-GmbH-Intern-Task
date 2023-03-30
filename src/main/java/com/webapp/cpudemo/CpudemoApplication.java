package com.webapp.cpudemo;

import com.webapp.cpudemo.model.Cpu;
import com.webapp.cpudemo.model.Socket;
import com.webapp.cpudemo.repository.SocketRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableJpaRepositories("com.webapp.cpudemo.repository")
@EntityScan("com.webapp.cpudemo.model")
public class CpudemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpudemoApplication.class, args);
	}
}
