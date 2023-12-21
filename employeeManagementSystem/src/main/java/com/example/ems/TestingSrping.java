package com.example.ems;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@ResponseBody
public class TestingSrping {
	
	@RequestMapping("/test")
	public String firstProgram() {
		return "Hello Spring boot this is my first prooject";
	}

}
