package com.khalil.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.khalil.dojosandninjas.models.Dojo;
import com.khalil.dojosandninjas.models.Ninja;
import com.khalil.dojosandninjas.services.DojoService;
import com.khalil.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/dashboard";
	}
	
	@GetMapping("/dashboard")
	public String index(Model model, @ModelAttribute("dojo")Dojo dojo) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String dojo(@ModelAttribute("dojo")Dojo dojo) {
		
		return "new_dojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo,
						BindingResult result) {
		if(result.hasErrors()) {
			return "new_dojo.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String details(Model model, @PathVariable("id") Long id) {

		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		
		return "dojo_show.jsp";
	}
}
