package com.madan.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.madan.demo.model.Transaction;

@SpringBootApplication
@EnableWebMvc
public class DemoApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(DemoApplication.class, args);
		
		ObjectMapper mapper = new ObjectMapper();
		Transaction t = new Transaction();
		t.setDate(new Date());
		System.out.println(mapper.writeValueAsString(t));
		
		
		System.out.println("test");
	}

}
