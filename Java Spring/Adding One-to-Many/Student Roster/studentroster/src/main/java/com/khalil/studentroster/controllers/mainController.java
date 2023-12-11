package com.khalil.studentroster.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khalil.studentroster.models.Dorm;
import com.khalil.studentroster.models.Student;
import com.khalil.studentroster.services.DormService;
import com.khalil.studentroster.services.StudentService;

import jakarta.validation.Valid;

@Controller
public class mainController {
	
	@Autowired
	private DormService dormService;
	@Autowired 
	private StudentService studentService;
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/dashboard";
	}
	
	@GetMapping("/dashboard")
	public String index(Model model, @ModelAttribute("dorm")Dorm dorm) {
		List<Dorm> dorms = dormService.allDorms();
		model.addAttribute("dorms", dorms);
		return "index.jsp";
	}
	
	@GetMapping("/dorms/new")
	public String dorm(@ModelAttribute("dorm")Dorm dorm) {
		
		return "newDorm.jsp";
	}
	
	@PostMapping("/dorms/new")
	public String create(@Valid @ModelAttribute("dorm") Dorm dorm,
						BindingResult result) {
		if(result.hasErrors()) {
			return "newDorm.jsp";
		}else {
			dormService.createDorm(dorm);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/students/new")
	public String student(@ModelAttribute("student") Student student, Model model) {
		List<Dorm> dorms = dormService.allDorms();
		model.addAttribute("dorms", dorms);
		return "newStudent.jsp";
	}

	@PostMapping("/dashboard")
	public String create(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "newStudent.jsp";
		} else {
			studentService.createStudent(student);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/dorms/{id}")
	public String details(Model model, @PathVariable("id") Long id) {

		Dorm dorm = dormService.findDorm(id);
		model.addAttribute("dorm", dorm);
		List<Student> students = studentService.allStudents();
		model.addAttribute("allStudents", students);
		return "dormShow.jsp";
	}
	
	@GetMapping("/student/{id}/remove")
	public String removeStudent(Model model, @PathVariable("id") Long id) {

		Student student = studentService.findStudent(id);
		studentService.removeStudent(student);
		return "redirect:/dashboard";
	}
	
	@PostMapping("/student/update/{dormId}")
	public String addStudentToDorm(@PathVariable("dormId") Long dormId,
								@RequestParam("studentId") Long studentId ) {
		System.out.println(studentId);
		System.out.println(dormId);
		
		Dorm dorm = dormService.findDorm(dormId);
		System.out.println(dorm.getName());
		Student student = studentService.findStudent(studentId);
		System.out.println(student.getName());
		studentService.addStudentToDorm(student, dorm);
		return "redirect:/dashboard";
	}
}
