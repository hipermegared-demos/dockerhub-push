package com.hipermegared.inventario.service.interfaces;

import java.util.List;

import com.hipermegared.inventario.model.Producto;

public interface IProductoService {
	
	List<Producto> findAll();
	Producto findById(long id);
	Producto create(Producto p);
	Producto update(Producto p);
	
}
