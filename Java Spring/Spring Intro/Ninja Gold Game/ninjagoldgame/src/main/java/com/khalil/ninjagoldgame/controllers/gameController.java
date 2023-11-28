package com.khalil.ninjagoldgame.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class gameController {
	int gold = 0;
	ArrayList<String> activities = new ArrayList<String>();
	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	public String index(HttpSession session,
			@RequestParam(value="farm", required=false)String farm,
			@RequestParam(value="cave", required=false)String cave,
			@RequestParam(value="house", required=false)String house,
			@RequestParam(value="quest", required=false)String quest,
			@RequestParam(value="spa", required=false)String spa) {
		if (gold<= -20 ){
			return "prison.jsp";
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMMM d Y h:mm a");
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold", gold);	
			session.setAttribute("activities", activities);
		}else {
			gold = (int) session.getAttribute("gold");
			activities = (ArrayList<String>)session.getAttribute("activities");
		}
		
		if(farm != null) {
			Random rand = new Random();
			int amount = rand.nextInt(10,21);
			gold += amount;
			session.setAttribute("gold", gold);
			activities.add(0,"You entered a Farm and you earned "+amount+" gold! ("+simpleDateFormat.format(new Date())+")");
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		if(cave != null) {
			Random rand = new Random();
			int amount = rand.nextInt(5,11);
			gold += amount;
			session.setAttribute("gold", gold);
			activities.add(0,"You entered a Cave and you earned "+amount+" gold! ("+simpleDateFormat.format(new Date())+")");
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		if(house != null) {
			Random rand = new Random();
			int amount = rand.nextInt(2,6);
			gold += amount;
			session.setAttribute("gold", gold);
			activities.add(0,"You entered a House and you earned "+amount+" gold! ("+simpleDateFormat.format(new Date())+")");
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		if(quest != null) {
			Random rand = new Random();
			int amount = rand.nextInt(-50,51);
			if(amount<0) {
				gold += amount;
				session.setAttribute("gold", gold);
				activities.add(0,"You failed a Quest and lost "+amount+" gold! Ouch ("+simpleDateFormat.format(new Date())+")");
				session.setAttribute("activities", activities);
				return "redirect:/";
			}else {
				gold += amount;
				session.setAttribute("gold", gold);
				activities.add(0,"You succeed a Quest and earned "+amount+" gold! Yey ("+simpleDateFormat.format(new Date())+")");
				session.setAttribute("activities", activities);
				return "redirect:/";
			}
		}
		if(spa != null) {
			Random rand = new Random();
			int amount = rand.nextInt(-20,-6);
			gold += amount;
			session.setAttribute("gold", gold);
			activities.add(0,"You get rest in the Spa and spent "+amount+" gold! ("+simpleDateFormat.format(new Date())+")");
			session.setAttribute("activities", activities);
			return "redirect:/";
		}
		return "index.jsp";
	}
	@RequestMapping("/activities")
	public String activities() {
		
		return "activities.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		activities = new ArrayList<String>();
		session.setAttribute("activities", activities);
		return "redirect:/";
	}
	@RequestMapping("/prisonOut")
	public String prisonOut(HttpSession session) {
		gold = 0;
		session.setAttribute("gold", 0);
		return "redirect:/";
	}
}
