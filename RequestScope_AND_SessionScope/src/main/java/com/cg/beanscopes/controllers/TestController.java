package com.cg.beanscopes.controllers;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import com.cg.beanscopes.api.MyBean;

@Controller
public class TestController {

	@Autowired
	MyBean myBean;

	@RequestMapping("/testing1")
	public void test1(HttpServletResponse res) throws IOException {
		res.getWriter().write("Old Name: " + myBean.getName());
		myBean.setName("Kavya Shree Updated!!!");
		res.getWriter().write("\nUpdated Name " + myBean.getName());

	}

	@RequestMapping("/testing2")
	public void test2(HttpServletResponse res) throws IOException {

		res.getWriter().write("My Name is :" + myBean.getName());

	}

}
