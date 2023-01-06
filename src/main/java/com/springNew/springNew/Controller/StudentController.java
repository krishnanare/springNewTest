package com.springNew.springNew.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springNew.springNew.Model.Student;
import com.springNew.springNew.Repository.StudentRepository;

/**
 * @author krishnakumar
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Optional<Student>> getStudent(@PathVariable Long id) {
		Optional<Student> findById = java.util.Optional.empty();
		try {
		 findById = studentRepo.findById(id);
		}catch (Exception e) {
			ResponseEntity.status(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(findById);
		
	}
	
	@GetMapping("/student/")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> findById = null;
		try {
		 findById = studentRepo.findAll();
		}catch (Exception e) {
			ResponseEntity.status(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(findById);
		
	}
	
	@PostMapping("/student/{id}")
	public ResponseEntity<Student> addStudent(@PathVariable Long id,@RequestBody Student student) {
		 Student save = null;
		try {
		  save = studentRepo.save(student);
		}catch (Exception e) {
			ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok(save);
		
	}

}
