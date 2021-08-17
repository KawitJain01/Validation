package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements CommandLineRunner {

	@Autowired MyRepo mRepo;
	
	@GetMapping("/V1/empIds")
	public Iterable<Employee> getMe(@RequestBody Iterable<Integer> ids)
	{
		System.out.println("Get me called "+ids);
		return mRepo.findAllById(ids);
	}

	@Override
	public void run(String... args) throws Exception {
		 List<Employee> ls = new ArrayList<>();
		 
		 ls.add(new Employee("A"));
		 ls.add(new Employee("B"));
		 
		 mRepo.saveAll(ls);
	}
}
