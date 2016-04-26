package com.krisnela.test.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HerokuTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuTestApplication.class, args);
	}
}
