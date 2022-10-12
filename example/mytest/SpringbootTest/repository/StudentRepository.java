package com.example.mytest.SpringbootTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mytest.SpringbootTest.entities.StudentEntities;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntities,Integer> {

}
