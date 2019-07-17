package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.TravelOwner;
import com.app.service.IYatraserv;

@Controller
@RequestMapping("/Trav")
public class Travcontroller {
	@Autowired
	private IYatraserv serv;

	@GetMapping("/regi")
	public String registration(TravelOwner t) 
	{
		
		return "Travel/regi";
	}
	@PostMapping ("/regi")
	public String proregi (TravelOwner t ) 
	{
		System.out.println(t);
		serv.registration(t);
		return "Travel/login";
	}
}
