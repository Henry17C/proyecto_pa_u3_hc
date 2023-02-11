package com.example.demo.unidad3.repo;

import java.util.List;

import com.example.demo.unidad3.modelo.Estudiante;
import com.example.demo.unidad3.modelo.dto.EstudianteDTO;

public interface IEstudianteRepo {
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	
	
	public Estudiante buscarPorCiudadQuery(String ciudad);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public void insertar (Estudiante e);
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);


	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	public Estudiante buscarPorNombreQueryListFRL(String nombre);
	public List<Estudiante>  buscarPorNombreNamedQueryList(String nombre);
	public List<Estudiante>  buscarPorNombreNativeQueryTypedNamedList(String nombre);
	
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
	
	public Estudiante buscarPorNombreCriteria(String nombre);
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero);


	
}
