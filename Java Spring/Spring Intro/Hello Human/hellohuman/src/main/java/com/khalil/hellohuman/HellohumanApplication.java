package com.khalil.hellohuman;

//import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
//	@RequestMapping("/")
//	public Map<String,String> welcome(@RequestParam Map<String,String> name){
//		return name;
//	}
	@RequestMapping("/")
	public String welcome(@RequestParam(value = "q", required=false) String name,
							@RequestParam(value = "qq",required=false)String lastName,
							@RequestParam(value = "qqq",required=false) Integer nbr){
//		int number = Integer.parseInt(nbr);
		System.out.println(nbr);
		while (nbr == null) {
			if(name == null & lastName == null) {
				return "Hello Human";
			}else if (lastName == null) {
				return "Hello "+name;
			}else {
				return "Hello "+name+lastName;
			}			
		}
		if(name == null & lastName == null) {
			return "Hello Human";
		}else if (lastName == null) {
			return (" Hello "+name).repeat(nbr);
		}else {
			return (" Hello "+name+" "+lastName).repeat(nbr);
		}
	}
}
