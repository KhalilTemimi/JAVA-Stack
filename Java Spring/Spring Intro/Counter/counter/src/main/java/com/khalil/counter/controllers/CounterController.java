package com.khalil.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		if(session.getAttribute("count")==null) {
			session.setAttribute("count",0);
		}else {
			int counter = (Integer) session.getAttribute("count");
			counter +=1;
			session.setAttribute("count",counter);
		}
		return "index.jsp";
	}
	@RequestMapping("/two")
	public String indexTwo(HttpSession session) {
		
		if(session.getAttribute("count")==null) {
			session.setAttribute("count",0);
		}else {
			int counter = (Integer) session.getAttribute("count");
			counter +=2;
			session.setAttribute("count",counter);
		}
		return "indexTwo.jsp";
	}
	@RequestMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
	@RequestMapping("/reset")
		public String reset(HttpSession session) {
			session.setAttribute("count",0);
			return "counter.jsp";
	}

}
