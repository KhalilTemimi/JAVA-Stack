package com.khalil.lookify.controllers;

import java.util.Collections;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.khalil.lookify.models.PlayList;
import com.khalil.lookify.services.PlayListService;

import jakarta.validation.Valid;

@Controller
public class PlayListController {
	
	@Autowired
	PlayListService playListService;
	@GetMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	
	@GetMapping("/dashboard")
	public String index(Model model, @ModelAttribute("playList")PlayList playList) {
		List<PlayList> playLists = playListService.allPlayLists();
		model.addAttribute("playLists", playLists);
		return "index.jsp";
	}
	
	@GetMapping("/songs/new")
	public String addNew(Model model,
			@ModelAttribute("playList")PlayList playList) {
		List<PlayList> playLists = playListService.allPlayLists();
		model.addAttribute("playLists", playLists);
		return "new.jsp";
	}
	
	@GetMapping("/songs/top-ten")
	public String topTen(Model model, @ModelAttribute("playList")PlayList playList) {
		List<PlayList> rangedPlayList = playListService.allPlayLists();
		Collections.sort(rangedPlayList, new RangeByRating());
		model.addAttribute("rangedPlayList",rangedPlayList);
		return "topSongs.jsp";
	}
	
	@PostMapping("/dashboard")
	public String create(Model model, @Valid @ModelAttribute("playList") PlayList playList,
						BindingResult result) {
		if(result.hasErrors()) {
			List<PlayList> playLists = playListService.allPlayLists();
			model.addAttribute("playLists", playLists);
			return "new.jsp";
		}else {
			playListService.createPlayList(playList);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/songs/{id}")
	public String details(Model model,@PathVariable("id")Long id) {
		
		PlayList playList = playListService.findPlayList(id);
		model.addAttribute("playList", playList);
		return "details.jsp";
	}
	
	@PostMapping("/search")
	public String search(Model model, @RequestParam("artist")String artist) {
		model.addAttribute("artist", artist);
		return "redirect:/search/"+artist;
	}
	
	@GetMapping("/search/{artist}")
	public String searchedList(Model model,@PathVariable("artist")String artist,
			@ModelAttribute("playList")PlayList playList) {
		
		List<PlayList> searchedPlayList = playListService.findByArtist(artist);
		model.addAttribute("searchedPlayList", searchedPlayList);
			return "search.jsp";			
	}
	
	@DeleteMapping("songs/{id}")
	public String destroy(@PathVariable("id")Long id) {
		playListService.deletePlayList(id);
		return "redirect:/dashboard";
	}
}
