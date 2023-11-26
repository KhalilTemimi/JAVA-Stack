package com.khalil.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
public class OmikujiController {
	
	@RequestMapping("/")
	public String form() {
		
		return "form.jsp";
	}
	@PostMapping("/process")
		public String process(
				@RequestParam(value="number") Integer number,
				@RequestParam(value="city") String city,
				@RequestParam(value="person") String person,
				@RequestParam(value="hobby") String hobby,
				@RequestParam(value="thing") String thing,
				@RequestParam(value="message") String message,
				HttpSession session) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("message", message);
		return "redirect:/show";
	}
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}

}
