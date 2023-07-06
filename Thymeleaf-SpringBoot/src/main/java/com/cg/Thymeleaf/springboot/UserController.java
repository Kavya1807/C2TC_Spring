package com.cg.Thymeleaf.springboot;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("if-unless")
	public String ifUnless(Model model) {

		User kavya = new User("Kavya", "kavya@gmail.com", "ADMIN", "F");
		User priya = new User("Priyanka", "prinku@gmail.com", "ADMIN", "F");
		User arjun = new User("Arjun", "arjun@gmail.com", "USER", "M");
		User meena = new User("Meena", "meena@gmail.com", "ADMIN", "F");

		List<User> users = new ArrayList<>();
		users.add(kavya);
		users.add(priya);
		users.add(arjun);
		users.add(meena);
		model.addAttribute("users", users);
		return "if-unless";
	}

	@GetMapping("switch-case")
	public String user(Model model) {
		User user = new User("Kavya", "kavya@gmail.com", "ADMIN", "F");
		model.addAttribute("user", user);
		return "switch-case";
	}
}
