package com.hipermegared.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hipermegared.inventario.model.Producto;
import com.hipermegared.inventario.service.interfaces.IProductoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/productos")
@CrossOrigin
@Tag(name = "Productos")
public class ProductoController {
	
	@Autowired
	private IProductoService svc;
	
	/*
	 * EL metodo get se usa para denotar una
	 * consulta de informacion
	 */
	@GetMapping
	public ResponseEntity<List<Producto>> all() {
		return ResponseEntity
			   .status(HttpStatus.OK)
			   .body(svc.findAll());
	}
	
	/*
	 * EL metodo get se usa para denotar una
	 * consulta de informacion
	 */
	@GetMapping("/id/{id}")
	public ResponseEntity<Producto> byId(@PathVariable long id) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(svc.findById(id));
	}
	
	/*
	 * Se usa el metodo POST para denotar
	 * que se creara un registro nuevo
	 */
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Producto> create(@RequestBody Producto p) {
		return ResponseEntity.status(HttpStatus.CREATED).body(svc.create(p));
	}
	
	/**
	 * El metodo PUT se utiliza para denotar
	 * que se va a hacer una actualizacion de
	 * un registro existente
	 */
	@PutMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Producto> update(@RequestBody Producto p) {
		return ResponseEntity.status(HttpStatus.CREATED).body(svc.update(p));
	}
	
	
	
}
