package com.example.demo.unidad3.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.unidad3.modelo.Estudiante;
import com.example.demo.unidad3.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		//select * from estudiante where estu_nombre="Pedro"
		//select e from Estudiante e where e.nombre= 'Pedro'
		//select e from Estudiante e where e.nombre= :datoNombre
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.nombre= :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.genero= :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.cedula= :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.ciudad= :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.apellido= :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante e) {
		
		entityManager.persist(e);
	}

	
	// QUERY TYPED
	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		TypedQuery<Estudiante> myTypedQuery= this.entityManager.createQuery("select e from Estudiante e where e.nombre= :datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	
	//NAMED QUERY
	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery= this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		 myQuery.setParameter("datoNombre", nombre) ;
		 return (Estudiante) myQuery.getSingleResult();
	}

	
	//NAMED QUERY TYPED
	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery= this.entityManager.createNamedQuery("Estudiante.buscarPorNom", Estudiante.class);
		
		 myQuery.setParameter("datoNombre", nombre) ;
		return myQuery.getSingleResult();
	}

	
	//NATIVE QUERY
	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		
		Query myQuery= this.entityManager.createNativeQuery("select * from estudiante where estu_nombre= :datoNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre) ;
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		
		TypedQuery<Estudiante> myQuery= this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		 myQuery.setParameter("datoNombre", nombre) ;
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.nombre= :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return  jpqlQuery.getResultList();
		//return  jpqlQuery.getFirstResult();
		
	}

	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante buscarPorNombreQueryListFRL(String nombre) {
		// TODO Auto-generated method stub
		Query jpqlQuery= this.entityManager.createQuery("select e from Estudiante e where e.nombre= :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return  (Estudiante) jpqlQuery.getResultList().get(0);
	}

	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		TypedQuery<EstudianteDTO> myTypedQuery= this.entityManager
				.createQuery("select NEW EstudianteDTO(e.nombre,e.apellido,e.cedula) from Estudiante e where e.nombre= :datoNombre", EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
