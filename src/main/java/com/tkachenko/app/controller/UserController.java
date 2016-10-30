package com.tkachenko.app.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tkachenko.app.data.User;

@Controller
@RequestMapping(value = "/register")
public class UserController {
	 
	@RequestMapping(method = RequestMethod.GET)
	public String showHomePage(ModelMap model) {
		User userForm = new User();    
        model.put("userForm", userForm);
         
        List<String> profile = new ArrayList<>();
        profile.add("login");
        profile.add("fio");
        profile.add("phone");
        model.put("profile", profile);
         
        return "Registration";
	}
	 
	@RequestMapping(method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("userForm") User user, ModelMap model) {
		model.addAttribute("id", user.getId());
		model.addAttribute("login", user.getLogin());
		model.addAttribute("fio", user.getFio());
		model.addAttribute("phone", user.getPhone());
		return "Success";
	}
}
