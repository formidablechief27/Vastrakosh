package com.mpr.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mpr.repository.MprRepository;
import com.mpr.service.*;

@RestController
@RequestMapping("/users")
public class MprController {
	
	@Autowired
	MprService service;
	
	@Autowired
	private MprRepository repository;
  
	@GetMapping("/createuserid/{username}/{password}")
	public org.springframework.web.servlet.ModelAndView ModelAndView(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		if(repository.existsById(username)) {
			modelAndView.setViewName("index3.html");
			return modelAndView;
		}
		else {
			modelAndView.setViewName("index2.html");
		}
        service.createUser(username, password);
        return modelAndView;
	}
	
	@GetMapping("/loginid/{username}/{password}")
	public org.springframework.web.servlet.ModelAndView ModelAndView1(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		if (service.getUser(username, password)) {
			modelAndView.setViewName("index2.html");
		}
		else {
			modelAndView.setViewName("login1.html");
		}
		return modelAndView;
	}
	
	@GetMapping("/loginid/{username}/{password}/about.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView2(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("about.html");
		return modelAndView;
	}
	
	@GetMapping("/createuserid/{username}/{password}/about.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView3(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("about.html");
		return modelAndView;
	}
	
	@GetMapping("/loginid/{username}/{password}/men.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView4(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("men.html");
		return modelAndView;
	}
	
	@GetMapping("/createuserid/{username}/{password}/men.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView5(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("men.html");
		return modelAndView;
	}
	
	@GetMapping("/loginid/{username}/{password}/women.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView6(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("women.html");
		return modelAndView;
	}
	
	@GetMapping("/createuserid/{username}/{password}/women.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView7(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("women.html");
		return modelAndView;
	}
	
	@GetMapping("/loginid/{username}/{password}/index2.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView9(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("index2.html");
		return modelAndView;
	}
	
	@GetMapping("/createuserid/{username}/{password}/index2.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView8(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("index2.html");
		return modelAndView;
	}
	
	@GetMapping("/loginid/{username}/{password}/community.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView10(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("community.html");
		return modelAndView;
	}
	
	@GetMapping("/createuserid/{username}/{password}/community.html")
	public org.springframework.web.servlet.ModelAndView ModelAndView11(@PathVariable String username, @PathVariable String password) {
		org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView();
		modelAndView.setViewName("community.html");
		return modelAndView;
	}
}

//@GetMapping("/loginid/{email}/{password}")
//public void login(@PathVariable String email, @PathVariable String password) {
//	service.checkUser(email, password);
//}
//
//@PostMapping("/loginidpost/")
//public void loginPost(@RequestBody Mpr mpr) {
//	service.checkUser(mpr.getEmail(), mpr.getPassword());
//}
//