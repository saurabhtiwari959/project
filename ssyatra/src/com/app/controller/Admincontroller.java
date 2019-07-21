package com.app.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Tours;
import com.app.pojos.TravelOwner;
import com.app.service.Itravservice;

@Controller
@RequestMapping("/admin")
public class Admincontroller {
	@Autowired
	private Itravservice travserv;
	@GetMapping("/add")
	public String showregi(TravelOwner t)
	{
		
	/*	travserv.add(new TravelOwner("royals", "saurabh", null, "tiwari", new Date(1,1,1091), "702823746",
				"GStnum12u3456")); */
		return "admin/added";
	}
	@PostMapping("/add")
	public String processregi(TravelOwner t)
	{
		travserv.add(t);
		return"/admin/login";
		
	}
	@GetMapping("/listtour")
	public String getalltour() 
	{
		return "admin/get";
	}
	
	@PostMapping("/listtour")
	public String showalltour(@RequestParam String dep,@RequestParam String arr) 
	{
		System.out.println(dep);
		System.out.println(arr);
		travserv.gettour(dep, arr);
		return "/admin/listout";
		
	}
}
