package com.vlup.vlnidhibank;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VlnidhibankApplication {

	public static void main(String[] args) {
		SpringApplication.run(VlnidhibankApplication.class, args);
		
		System.out.println("Nidhi Bank Bankend Runs");
	}
  
	  @Bean
	  public ModelMapper modelMapper() {
		  return new ModelMapper();
	  }
}
