package com.example.mytest.SpringbootTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mytest.SpringbootTest.entities.StudentEntities;
import com.example.mytest.SpringbootTest.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository srepo;
	public StudentEntities saveStudent(StudentEntities stud) {
		
	return	srepo.save(stud);
		
	}
	public List<StudentEntities> getAllStudent(){
		return srepo.findAll();
	}
	public StudentEntities getByStudId(int id) {
		return srepo.findById(id).get();
	}
	public void deleteAllStudent(int id) {
		srepo.deleteById(id);
	}

}
