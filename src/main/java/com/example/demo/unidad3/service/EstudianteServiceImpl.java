package com.example.demo.unidad3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unidad3.modelo.Estudiante;
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

}
