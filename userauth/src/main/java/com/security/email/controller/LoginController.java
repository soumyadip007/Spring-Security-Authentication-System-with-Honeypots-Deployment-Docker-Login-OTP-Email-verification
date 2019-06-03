package com.security.email.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


	@GetMapping("/showMyLoginPage")
	public String showHome()
	{
		
		return "login";
//		return "fancylogin";
	}

}
