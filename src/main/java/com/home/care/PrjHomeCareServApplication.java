package com.home.care;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication 
@EnableJdbcRepositories
public class PrjHomeCareServApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrjHomeCareServApplication.class, args);
	}

}
