package com.example.demo.deber11.repo;

import com.example.demo.deber11.modelo.Cliente;

public interface IClienteRepo {
	
	public void insertar (Cliente cliente );
	public void actualizar (Cliente cliente );
	public Cliente buscar (String cedula );
	public void borrar (String cedula  );
}
