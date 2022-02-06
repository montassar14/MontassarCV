package org.talan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.data.repository.config.RepositoryConfiguration;

@SpringBootApplication
public class MontassarCvApplication implements CommandLineRunner {
	
	//@Autowired
	//private RepositoryRestMvcAutoConfiguration repositoryRestMvcAutoConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MontassarCvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//repositoryRestMvcAutoConfiguration
		
	}

}
