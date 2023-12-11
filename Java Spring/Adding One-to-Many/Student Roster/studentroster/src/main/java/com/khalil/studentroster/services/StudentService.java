package com.khalil.studentroster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.studentroster.models.Dorm;
import com.khalil.studentroster.models.Student;
import com.khalil.studentroster.repositories.DormRepository;
import com.khalil.studentroster.repositories.StudentRepository;

@Service
public class StudentService {
	// C R U D
	
				@Autowired
				private StudentRepository studentRepository;
				
//				READ ALL
				public List<Student> allStudents() {
					return studentRepository.findAll();
				}

//				CREATE
				public Student createStudent(Student student) {
					return studentRepository.save(student);
				}

//				READ ONE
				public Student findStudent(Long id) {
					Optional<Student> maybeStudent = studentRepository.findById(id);
					if (maybeStudent.isPresent()) {
						return maybeStudent.get();
					} else {
						return null;
					}
				}

//				UPDATE
				public Student updateStudent(Student student) {
					return studentRepository.save(student);
				}

//				DELETE
				public void deleteStudent(Long id) {
					studentRepository.deleteById(id);
				}
				
				// Remove from Dorm 
				public void removeStudent(Student student) {
					student.setDorm(null);
					studentRepository.save(student);
				}
				// Add to Dorm
				public void addStudentToDorm(Student student, Dorm dorm) {
					student.setDorm(dorm);
					studentRepository.save(student);
				}
}
