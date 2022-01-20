package com.LamiaOmar.PointDeVente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class}
)
public class PointDeVenteApplication {

	public static void main(String[] args) {

		SpringApplication.run(PointDeVenteApplication.class, args);
	}

}
