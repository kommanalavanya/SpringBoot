package com.jobiak.mongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MongodbappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1=new Employee("1","john","mumbai");
		Employee e2=new Employee("2","Cathereine","boston");
		Employee e3=new Employee("3","Sony","california");
		Employee e4=new Employee("4","Rosy","Swiss");
	}

}
