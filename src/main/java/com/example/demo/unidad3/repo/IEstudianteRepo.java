package com.example.demo.unidad3.repo;

import com.example.demo.unidad3.modelo.Estudiante;

public interface IEstudianteRepo {
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String Apellido);

}
