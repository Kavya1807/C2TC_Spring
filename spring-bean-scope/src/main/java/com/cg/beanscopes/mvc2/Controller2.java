package com.cg.beanscopes.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cg.beanscopes.api.ApplicationScopeTest;
import com.cg.beanscopes.api.SingletonTest;

@Controller
@RequestMapping("/app2")
public class Controller2 {

	@Autowired
	private ApplicationScopeTest appScopeTest;

	@Autowired
	private SingletonTest singletonTest;

	@ResponseBody
	@RequestMapping("/accessvalue")
	public String appTwo() {

		return "App Two >>> " + "ApplicationScopeTest value " + appScopeTest.getN() + " singletonTest value "
				+ singletonTest.getN();

	}

}
