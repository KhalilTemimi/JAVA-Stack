package com.khalil.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.khalil.savetravels.models.SaveTravel;
import com.khalil.savetravels.services.SaveTravelService;

import jakarta.validation.Valid;

@Controller
public class SaveTraveController {
	@Autowired
	SaveTravelService saveTravelService;
	@GetMapping("/")
	public String redirect() {
		return "redirect:/saveTravels";
	}
	
	@GetMapping("/saveTravels")
	public String index(Model model,
			@ModelAttribute("saveTravel")SaveTravel saveTravel) {
		List<SaveTravel> saveTravels = saveTravelService.allSaveTravels();
		model.addAttribute("saveTravels", saveTravels);
		return "index.jsp";
	}
	

	@PostMapping("/saveTravels")
	public String create(Model model, @Valid @ModelAttribute("saveTravel") SaveTravel saveTravel,
						BindingResult result) {
		if(result.hasErrors()) {
			List<SaveTravel> saveTravels = saveTravelService.allSaveTravels();
			model.addAttribute("saveTravels", saveTravels);
			return "index.jsp";
		}else {
			saveTravelService.createSaveTravel(saveTravel);
			return "redirect:/saveTravels";
		}
	}
	
	@GetMapping("/saveTravels/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		SaveTravel saveTravel = saveTravelService.findSaveTravel(id);
		model.addAttribute("saveTravel", saveTravel);
		return "edit.jsp";
	}
	@PutMapping("/saveTravels/{id}")
	public String update(@Valid @ModelAttribute("saveTravel") SaveTravel saveTravel,
						BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			saveTravelService.updateSaveTravel(saveTravel);
			return "redirect:/saveTravels";
		}
	}
	@GetMapping("/saveTravels/{id}/details")
	public String details(Model model,@PathVariable("id")Long id) {
		
		SaveTravel saveTravel = saveTravelService.findSaveTravel(id);
		model.addAttribute("saveTravel", saveTravel);
		return "details.jsp";
	}
	@DeleteMapping("saveTravels/{id}")
	public String destroy(@PathVariable("id")Long id) {
		saveTravelService.deleteSaveTravel(id);
		return "redirect:/";
	}
}
