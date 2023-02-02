package com.example.demo.deber11.service;

import com.example.demo.deber11.modelo.Vehiculo;

public interface IVehiculoService {
	public void insertar (Vehiculo vehiculo);
	public void actualizar (Vehiculo vehiculo);
	public Vehiculo buscar (String placa);
	public void eliminar (String placa);

}
