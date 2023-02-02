package com.example.demo.deber11.repo;

import com.example.demo.deber11.modelo.Renta;

public interface IReantaRepo {
	
	
	
	public void insertar(Renta renta);
	public void actualizar (Renta renta );
	public Renta buscar (Integer id);
	public void  eliminar (Integer id);

}
