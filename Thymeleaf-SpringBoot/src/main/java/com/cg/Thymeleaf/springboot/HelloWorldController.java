package com.cg.Thymeleaf.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello World");
	 return "helloworld";
	}

	
	@GetMapping("/style")
	public String Style() {
		return "add-cs-js-demo";
	}

	
	@GetMapping("/bootstrap")
	public String bootstrap() {
		return "add-bootstrap";
	}

}
