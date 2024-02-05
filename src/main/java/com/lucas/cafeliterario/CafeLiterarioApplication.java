package com.lucas.cafeliterario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CafeLiterarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafeLiterarioApplication.class, args);
	}

}
