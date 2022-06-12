package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2() {
		System.out.println("home2");
		return "index";
	}
	
//	@GetMapping("")
//	public 
}
