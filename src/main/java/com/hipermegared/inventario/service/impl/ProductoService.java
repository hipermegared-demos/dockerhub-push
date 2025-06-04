package com.hipermegared.inventario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hipermegared.inventario.model.Producto;
import com.hipermegared.inventario.repository.ProductoRepository;
import com.hipermegared.inventario.service.interfaces.IProductoService;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepository repo;

	/***
	 * Enlista todos los productos
	 */
	@Override
	public List<Producto> findAll() {

		return repo.findAll();
	}

	/***
	 * Retorna un producto por su ID Si no lo encuentra, regresa el valor null
	 */
	@Override
	public Producto findById(long id) {

		return repo.findById(id).orElse(null);
	}

	/***
	 * Crea un producto en la BD
	 */
	@Override
	public Producto create(Producto p) {
		return repo.save(p);
	}

	/***
	 * Actualiza un producto existente
	 * 
	 * La funcion save crea y actualiza 
	 * crea: Si el objeto no existe 
	 * actualiza: Si
	 * el ID ya existe en la base
	 * 
	 * Se separo en 2 metodos diferentes para mayor claridad
	 */
	@Override
	public Producto update(Producto p) {

		return repo.save(p);
	}

}
