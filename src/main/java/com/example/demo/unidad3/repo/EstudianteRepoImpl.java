package com.example.demo.unidad3.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.unidad3.modelo.Estudiante;
import com.example.demo.unidad3.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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
				.createQuery("select NEW com.example.demo.unidad3.modelo.dto.EstudianteDTO(e.nombre,e.apellido,e.cedula, e.genero) from Estudiante e where e.ciudad= :datoNombre", EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	//CRITERIA
	@Override
	public Estudiante buscarPorNombreCriteria(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		
		//especificamos el tipo de retorno de mi query
		CriteriaQuery<Estudiante> myQuery= myBuilder.createQuery(Estudiante.class);
		
		//comenzamos a crear el SQL como tal
		//definiendo el FROM-Root 
		
		Root<Estudiante> myTablaFrom = myQuery.from(Estudiante.class);//FROM Esatudiante
		
		//las condiciones WHERE se cnocen en criteria api query como predicados
		//                                     e.nombre=     :datoNombre
		Predicate condicion1= myBuilder.equal(myTablaFrom.get("nombre"), nombre);
		myQuery.select(myTablaFrom).where(condicion1);
		//delcarado mi query 
		
		//la ejecucion del query lo realizamos con cualquier tipo ya con ocido: Recomendacion typedQuery
		TypedQuery<Estudiante> mySQL= this.entityManager.createQuery(myQuery);	
		return mySQL.getSingleResult();
	}

	//criteria AND OR 
	
	@Override
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myQuery= myBuilder.createQuery(Estudiante.class);
		Root<Estudiante> myTablaFrom = myQuery.from(Estudiante.class);//FROM Esatudiante
//M: e.nombre= AND e.apellido=
//F: e.nombre= OR  e.apellido=
		
		//creamos los predicado del nombre
		Predicate p1 = myBuilder.equal(myTablaFrom.get("nombre"), nombre);
		
		//predicado del apellido
		Predicate p2 = myBuilder.equal(myTablaFrom.get("apellido"), apellido);
		
		Predicate predicadoFinal=null;
		if(genero.equals("M")) {
		//predicado de AND 
				predicadoFinal = myBuilder.and(p1,p2);	
		}else {
			//predicado de OR 
			predicadoFinal = myBuilder.or(p1,p2);}
		
		//la ejecucion del query lo realizamos conb cualquier tipo ya conocido : typedQuery
		myQuery.select(myTablaFrom).where(predicadoFinal);
		TypedQuery<Estudiante> mySQL= this.entityManager.createQuery(myQuery);	

		return mySQL.getResultList();
	}
	
	
	//ACTUALIZAR E INSERTAR

	@Override
	public int eliminarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		//DELETE FROM ESTUDIANTE WHERE estu_apellido='Teran'
		Query myQuery= this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.apellido = :datoEntrada");
		myQuery.setParameter("datoEntrada", apellido);
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		//UPDATE Estudinate set estu_nombre='Edison' Where estu_apellido='Cayambe'
		Query myQuery= this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre= :datoNombre Where e.apellido= :datoApellido ");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.executeUpdate();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
