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
	public Estudiante buscarPorApellidoQuery(String Apellido) {
		// TODO Auto-generated method stub
		return null;
	}

}
