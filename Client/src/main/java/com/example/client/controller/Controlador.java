package com.example.client.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("/")
	public String index(Model model, Principal infoUsuario) {
		if (infoUsuario != null) {
			model.addAttribute("usuario", infoUsuario.getName());
		}
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/ejemplo")
	public String ejemplo(Model model, Principal infoUsuario) {
		if (infoUsuario != null) {
			model.addAttribute("usuario", infoUsuario.getName());
		}
		return "ejemplo";
	}

}
