package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WikiWelcomeController {
	
	@RequestMapping("/")
	public String welcome(){
		
		System.out.println("HELLO MADHAN"); 
		return "welcome";	
		
	}

}
