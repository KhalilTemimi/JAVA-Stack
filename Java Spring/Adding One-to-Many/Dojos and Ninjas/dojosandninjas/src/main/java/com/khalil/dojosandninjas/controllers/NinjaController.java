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
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;

	@GetMapping("/ninjas/new")
	public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "new_ninja.jsp";
	}

	@PostMapping("/dashboard")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "new_ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/dashboard";
		}
	}

	@GetMapping("/ninjas/{id}")
	public String details(Model model, @PathVariable("id") Long id) {

		Ninja ninja = ninjaService.findNinja(id);
		model.addAttribute("ninja", ninja);
		return "ninja_show.jsp";
	}
}
