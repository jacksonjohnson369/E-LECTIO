package com.example.demo.controller;

import java.util.ArrayList;
import java .util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Student;
import com.example.demo.repository.StudentRepo;



@Controller

public class HomeController {

	@Autowired
	private StudentRepo repo;
	
	
	@GetMapping("/student")
	public String showHomePage() {
		return "index";
		
	}
	
	@PostMapping("/student/insert")
	public String insert(Student st, Model model) {
		repo.save(st);
		model.addAttribute("st", st);
		return "sucess";
	}
	@GetMapping("/viewstudents")
	public String getStudent(Model model) {
	ArrayList<Student>list =new ArrayList<Student>();
	list=(ArrayList<Student>) repo.findByUsername("jackson");
	
	model.addAttribute("list",list);  
	      return "view";    
	}
	
	
	
}

