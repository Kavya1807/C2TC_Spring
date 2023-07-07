package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student updateStudent(Student student);

	Student getStudentById(Long id);

	void deleteStudentById(Long id);

}
