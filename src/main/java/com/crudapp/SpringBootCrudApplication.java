package com.crudapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EntityScan("com.crudapp.entity")
@EnableJpaRepositories("com.crudapp.repository")
public class SpringBootCrudApplication implements CommandLineRunner {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBootCrudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);

		LOGGER.info("-- APPLICATION RUNNING --");
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
