package com.example.demo.unidad3.service;

import com.example.demo.unidad3.modelo.Estudiante;

public interface IEstudianteService {
	
	public Estudiante buscarPorNombre(String nombre);
	public Estudiante buscarPorApellido(String Apellido);

}
