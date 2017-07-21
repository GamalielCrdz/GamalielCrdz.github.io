package controller;

import services.UserServices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//http://www.heroesdelcodigo.com/crud-usando-spring-boot-spring-data-jpa-thymeleaf/
@Controller
public class UsariosController{
	
	@Autowired
	private UserServices userServices;
	
	
	@RequestMapping("/")
	public String addNewUser(Model model) {
		
		return "form";

	}

}
