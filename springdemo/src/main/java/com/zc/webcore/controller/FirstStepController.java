package com.zc.webcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstStepController {
	
	@RequestMapping("/toLogin")
	public String login(){
		return "login";
	}
}
