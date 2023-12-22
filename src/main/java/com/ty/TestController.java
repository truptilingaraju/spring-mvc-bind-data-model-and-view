package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/info")
	public ModelAndView showMessage() {
		
		ModelAndView view=new ModelAndView("myMessage.jsp");
		view.addObject("kingName", "Aditya");
		view.addObject("queenName", "Geet");
		
		return view;
	}
}
