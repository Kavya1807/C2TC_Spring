package com.cg.beanscope.mvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cg.beanscopes.api.ApplicationScopeTest;
import com.cg.beanscopes.api.SingletonTest;

@Controller
@RequestMapping("/app1") //root level req mapping
public class Controller1 {

	@Autowired
	private ApplicationScopeTest appScopeTest;

	@Autowired
	private SingletonTest singletonTest;

	@ResponseBody
	@RequestMapping("/changedefaultvalue")
	public String test() {

		appScopeTest.setN(10);

		singletonTest.setN(10);

		return "App One >>> " + "ApplicationScopeTest value " + appScopeTest.getN() + " singletonTest value "
				+ singletonTest.getN();

	}

}
