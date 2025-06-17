package com.hipermegared.inventario.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin("*")
@Tag(name= "Utilerias", description ="Controlador con herramientas varias.")
@RequestMapping("/utils")
public class UtilsController {
	
	@Value("${utils.version}")
	private String version;
	
	@GetMapping("/version")
	public String version() {
		return version;
	}
	
}
