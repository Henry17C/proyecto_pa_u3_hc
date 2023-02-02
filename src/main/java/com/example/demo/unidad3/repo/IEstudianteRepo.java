package com.example.demo.unidad3.repo;

import com.example.demo.unidad3.modelo.Estudiante;

public interface IEstudianteRepo {
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public void insertar (Estudiante e);

}
