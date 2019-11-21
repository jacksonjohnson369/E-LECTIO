package com.example.demo.repository;

import java.util.List;

import javax.swing.Spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Student;

@Repository

public interface StudentRepo extends JpaRepository<Student,Integer >{
	
List<Student> findByUsername(String Username);



	
}
