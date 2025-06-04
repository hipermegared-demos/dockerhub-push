package com.hipermegared.inventario.model;

import com.fasterxml.jackson.databind.JsonSerializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
	
	// Indica que este campo es el ID de la tabla
	@Id
	/*
	 * Indica que el valor del campo sera autoincremental
	 * de 1 en 1 de forma automatica
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String descripcion;
	private double precio;

	public Producto(Long id, String descripcion, double precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Producto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
