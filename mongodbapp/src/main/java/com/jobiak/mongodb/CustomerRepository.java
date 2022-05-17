package com.jobiak.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Employee, String> {
	

}
