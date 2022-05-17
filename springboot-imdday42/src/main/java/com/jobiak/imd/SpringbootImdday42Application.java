package com.jobiak.imd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@SpringBootApplication
public class SpringbootImdday42Application 	implements CommandLineRunner {
	@Autowired
	 CustomerRepo repo;

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootImdday42Application.class, args);
		
		
	}

	public void run(String... args) throws Exception {

		
		Customer c1 = new Customer();
		c1.setAcctno(101);
		c1.setName("John");
		c1.setBalance(4000);
		repo.save(c1);

		/*Customer c2 = new Customer();
		c2.setAcctno(102);
		c2.setName("Json");
		c2.setBalance(5000);
		repo.save(c2);

		Customer c3 = new Customer();
		c3.setAcctno(103);
		c3.setName("Xiang");
		c3.setBalance(9000);
		repo.save(c3);*/

		
	}

}
@Configuration
class CustomerConfiguration{
	@Bean
	public Customer createCustomer() {
		
	return new Customer();
	}
	
}
