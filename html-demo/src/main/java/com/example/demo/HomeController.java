package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping("/add")
	public ModelAndView homePage()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index.html");
		return mv;
	}
}
