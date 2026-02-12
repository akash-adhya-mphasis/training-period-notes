package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("/home")
//@GetMapping("/home")		// we cannot use it here
public class AppController {
	
	ArrayList<Employee> list;
	public AppController() {
		list = new ArrayList<Employee>();
		
		list.add(new Employee(101, "Akash", 22));
		list.add(new Employee(102, "Sauvik", 24));
		list.add(new Employee(103, "saikat", 22));
		list.add(new Employee(104, "saikat", 22));
		
	}
	
	@GetMapping("/hi")
	public String welcome() {
		return "First program of spring boot";
	}
	
	@GetMapping("/some")
	public String welcomegg() {
		return "welcome to spring boot";
	}
	
	@GetMapping("/show")
	public ArrayList<Employee> display() {
		return list;
	}
}
