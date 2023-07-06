package com.cg.Thymeleaf.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/iterations")
	public String Iteration(Model model) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Vidya", "Shree", "vidya@gmail.com"));
		employees.add(new Employee("Kavya", "Shree", "kavya@gmail.com"));
		employees.add(new Employee("Preethi", "Sharma", "preethi@gmail.com"));
		model.addAttribute("employees", employees);
		return "iteration";


	}

}
