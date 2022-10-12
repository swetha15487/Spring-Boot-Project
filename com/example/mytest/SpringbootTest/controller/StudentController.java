package com.example.mytest.SpringbootTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mytest.SpringbootTest.entities.StudentEntities;
import com.example.mytest.SpringbootTest.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studser;
	@PostMapping("/saveStudent")
	public StudentEntities saveAllStudent(@RequestBody StudentEntities stud) {
		return studser.saveStudent(stud);
	}
	@GetMapping("/view")
	public List<StudentEntities>getStudent()
	{
		return studser.getAllStudent();
	}
	@PostMapping("/update")
	public String updateStudent(@RequestBody StudentEntities stud) {
	 studser.saveStudent(stud);
		return "Updated Successfully";
		
	}
	@GetMapping("/getbyid/{id}")
	public StudentEntities getBystudentId(@PathVariable("id")int id)
	{
		return studser.getByStudId(id);
	}
	@GetMapping("/delete/{id}")
	
	public String removeStudent(@PathVariable("id") int id) {
		 studser.deleteAllStudent(id);
		 return "Success";
	
	}
}
