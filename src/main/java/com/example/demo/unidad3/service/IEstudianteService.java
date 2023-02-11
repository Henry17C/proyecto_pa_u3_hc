package com.example.demo.unidad3.service;

import java.util.List;

import com.example.demo.unidad3.modelo.Estudiante;
import com.example.demo.unidad3.modelo.dto.EstudianteDTO;

public interface IEstudianteService {
	
	public Estudiante buscarPorNombre(String nombre);
	public Estudiante buscarPorGenero(String genero);
	public Estudiante buscarPorCedula(String cedula);
	public Estudiante buscarPorCiudad(String ciudad);
	public Estudiante buscarPorApellido(String apellido);
	public void insertar (Estudiante e);
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);

	
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	public Estudiante buscarPorNombreQueryListFRL(String nombre);
	
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
//criteria	
	public Estudiante buscarPorNombreCriteria(String nombre);

	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero);

}
