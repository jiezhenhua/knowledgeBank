package com.zhjie.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(){
		return "home/home";
	}
	
	@RequestMapping(value = "/fwb", method = RequestMethod.GET)
	public String fwb(){
		return "fwb/fwb";
	}
}
