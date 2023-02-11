package com.example.demo.unidad3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unidad3.modelo.Estudiante;
import com.example.demo.unidad3.modelo.dto.EstudianteDTO;
import com.example.demo.unidad3.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreQuery(nombre);
	}


	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorGeneroQuery(genero);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorCedulaQuery(cedula);
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorCiudadQuery(ciudad);
	}


	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorApellidoQuery(apellido);
	}


	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		estudianteRepo.insertar(e);
	}

	//TYPED QUERY
	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreQueryTyped(nombre);
	}


	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreNamedQuery(nombre);
	}


	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreNamedQueryTyped(nombre);
	}


	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreNativeQuery(nombre);
	}


	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreNativeQueryTypedNamed(nombre);
	}


	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreNamedQueryList(nombre);
	}


	@Override
	public Estudiante buscarPorNombreQueryListFRL(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreQueryListFRL(nombre);
	}


	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreQueryTypedDTO(nombre);
	}


	@Override
	public Estudiante buscarPorNombreCriteria(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreCriteria(nombre);
	}


	@Override
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscarPorNombreCriteriaAndOr(nombre, apellido, genero);
	}


	@Override
	public int eliminarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.eliminarPorApellido(apellido);
	}


	@Override
	public int actualizarPorApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.actualizarPorApellido(apellido, nombre);
	}

}
