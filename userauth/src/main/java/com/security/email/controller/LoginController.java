package com.security.email.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


	@GetMapping("/myLoginPage")
	public String showHome()
	{
	return "login";
//		return "fancylogin";
	}

}
