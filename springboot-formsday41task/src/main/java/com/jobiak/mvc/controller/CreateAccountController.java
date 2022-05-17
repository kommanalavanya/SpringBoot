package com.jobiak.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvc.model.Account;
import com.jobiak.mvc.repository.UserRepository;

@Controller
public class CreateAccountController {
	
	@Autowired
	UserRepository repo;
	public CreateAccountController() {
		// TODO Auto-generated constructor stub
	}
	
	public UserRepository getRepo() {
		return repo;
	}

	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}

	@RequestMapping(path="/test",method=RequestMethod.GET)
    public String redirect() {
   	   return "create";
    }
	@RequestMapping(path="/create",method=RequestMethod.POST)
	public String doCreateAccount(@ModelAttribute("account")Account account) {
		repo.save(account);
	  return "success";
		
		
	}

}
