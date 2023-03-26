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


		// add one-to-many relationship test
		/* ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(CpudemoApplication.class, args);
		SocketRepository socketRepository = configurableApplicationContext.getBean(SocketRepository.class);

		Socket socket = new Socket("Socket 1700");
		Cpu cpu1 = new Cpu("Intel", "Core i5-13500", new BigDecimal("2.5"), new BigDecimal("4.8"),
				14, 20, new BigDecimal("75"), new BigDecimal("1319.00"), socket);
		Cpu cpu2 = new Cpu("Intel", "Core i5-13500", new BigDecimal("2.5"), new BigDecimal("4.8"),
				14, 20, new BigDecimal("75"), new BigDecimal("1319.00"), socket);
		Set<Cpu> cpus = new HashSet<>();
		cpus.add(cpu1);
		cpus.add(cpu2);
		socket.setCpus(cpus);
		socketRepository.save(socket);*/
	}

}
