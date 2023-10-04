package com.utn.apiRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args){System.out.println("hola");
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
