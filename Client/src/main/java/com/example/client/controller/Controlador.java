package com.example.client.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.client.service.RecordsDAO;

@Controller
public class Controlador {

	@Autowired
	private RecordsDAO recordsRepositoy;
	
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
	
	@GetMapping("/records")
	public String ejemplo(Model model, Principal infoUsuario) {
		if (infoUsuario != null) {
			model.addAttribute("usuario", infoUsuario.getName());
		}
		model.addAttribute("records", recordsRepositoy.getRecords());
		return "records";
	}

}
