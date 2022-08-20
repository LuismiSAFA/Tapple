package com.tapple.JuegoTapple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//import com.tapple.JuegoTapple.controller.PlatoRestController;

@EnableJpaAuditing
@SpringBootApplication
public class JuegoTappleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuegoTappleApplication.class, args);
		
	}

}
