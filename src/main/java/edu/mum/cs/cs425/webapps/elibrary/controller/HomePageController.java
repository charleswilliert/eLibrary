package edu.mum.cs.cs425.webapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	
	@GetMapping(value= {"/","eLibrary","eLibrary/home"})
	public String displayHomePge() {
		
		return"home/index";
	}

}
