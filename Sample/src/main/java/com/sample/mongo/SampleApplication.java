package com.sample.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
	@Autowired
	private CustomerRepository repository;
	
	@Autowired
	public RepoSample repoSample;
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		
		
		repoSample.save(new User("Ajay","Ajay"));
		repoSample.save(new User("Ajay1","Ajay1"));
		repoSample.save(new User("Ajay2","Ajay2"));
		
		List<User> li=(List<User>) repoSample.findAll();
		System.out.println(li);
	}

}
