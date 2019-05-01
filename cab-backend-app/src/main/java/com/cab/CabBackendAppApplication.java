package com.cab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabBackendAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBackendAppApplication.class, args);
	}

//	public void authenticationManager (AuthenticationManagerBuilder builder , UserRepository userRepository) throws Exception{
//		builder.userDetailsService(s -> new CustomerUserDetails(userRepository.findByUserName(s)));
//	}

}
