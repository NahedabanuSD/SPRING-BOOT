package com.example.naheda.Assignment1.BakeryAssignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class BakeryAssignment1Application  implements CommandLineRunner {

	@Autowired //field injection
	CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(BakeryAssignment1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}



}
