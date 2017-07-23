package com.applicacion.controller;

import com.applicacion.entities.Usuarios;
import com.applicacion.services.UserServices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//http://www.heroesdelcodigo.com/crud-usando-spring-boot-spring-data-jpa-thymeleaf/
@Controller
public class UsariosController{
	
	@Autowired
	private UserServices userServices;
	
	@RequestMapping(path="/")
	public String prueba() {
		return "form";
	}
	
	/*@RequestMapping("/")
	public String addNewUser(Model model) {
		model.addAttribute("usuario", new Usuarios());
		return "form";

	}
	*/
	
	
	@RequestMapping(value="usuario", method= RequestMethod.POST)
	public String saveUser(Usuarios usuario) {
		userServices.saveUser(usuario);
		return "redirect:/";
	}
	

	 
	
	
}
