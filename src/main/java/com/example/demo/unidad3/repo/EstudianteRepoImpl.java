package com.example.demo.unidad3.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.unidad3.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre="Pedro"
		//select e from Estudiante e where e.nombre= 'Pedro'
		//select e from Estudiante e where e.nombre= :datoNombre
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.nombre= :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.genero= :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.cedula= :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.ciudad= :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.apellido= :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante e) {
		
		entityManager.persist(e);
	}

}
