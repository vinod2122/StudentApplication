package com.vinod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.model.Student;
import com.vinod.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo repo;
	@Override
	public Student saveStudent(Student s) {
		
		return repo.save(s);
	}

	public void deleteStudent(Integer sid) {
		repo.deleteById(sid);

	}

	@Override
	public Student getStudent(Integer sid) {
		Student s=repo.findById(sid).get();
		return s;
	}
	
	@Override
	public List<Student> getAllStudent(){
		List<Student> std=repo.findAll();
		return std;
	}

}
