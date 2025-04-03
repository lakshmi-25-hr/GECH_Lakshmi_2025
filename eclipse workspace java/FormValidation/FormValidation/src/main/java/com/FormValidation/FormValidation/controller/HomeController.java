package com.FormValidation.FormValidation.controller;

		import java.util.List;

import org.springframework.stereotype.Controller;
		import org.springframework.ui.Model;
		import org.springframework.validation.BindingResult;
		import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.ModelAttribute;
		import org.springframework.web.bind.annotation.PostMapping;

		import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.models.Student;
import com.FormValidation.FormValidation.service.StudentService;

		import jakarta.validation.Valid;

		@Controller
		public class HomeController {
			//to create object constructor injection
			private final StudentService studentservice;
				
			
			
		public HomeController(StudentService studentservice) {
				super();
				this.studentservice = studentservice;
			}


		@GetMapping({"","/"})
		public String home() {
			return "home";
		}



		//get method to fill the data



		@GetMapping("/add-student")
		public String Add_student(Model model) {
			model.addAttribute("studentDTO", new StudentDTO());
			return "Add_students";
		}
		@GetMapping("/student-list")
		public String listStudents(Model  model) {
			List<Student> students=studentservice.getAllStudents();
			model.addAttribute("students",students);
			return "student-list";
		}


		//after filling the form has post it back to database
		@PostMapping("/add-student")
		public String Add_student(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result,Model model) {
			if(result.hasErrors()) {
				return "Add_students";
			}
			
			
			//System.out.println(studentDTO.getName()+"2");
			studentservice.saveStudent(studentDTO);
			return "redirect:/";
		}
		
		}
		    
		    
		    
	

