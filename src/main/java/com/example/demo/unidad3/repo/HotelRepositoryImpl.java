package com.example.demo.unidad3.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.unidad3.modelo.Habitacion;
import com.example.demo.unidad3.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepositoryImpl implements IHotelRepository{

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> BuscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		//HACER REFERENCIA A LA RELACION
		// NO ES NECESARIO IGUALAR LAS FK Y PK(ON) PUESTO QUE ESTA RELACION YA SE HIZO CON EL MAPERO DE ONETOMAYNY MANYTOONE
		//INNER JOIN = JOIN, com es lo mismo jakarta lo omite
		
		TypedQuery<Hotel> myQuery= this.entityManager.createQuery("SELECT h FROM Hotel h  INNER JOIN h.habitaciones ha WHERE ha.tipo= :datoTipo ",Hotel.class) ;
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		List<Hotel> listHot= myQuery.getResultList();
		List<Hotel> tmp;
		
		for (Hotel h : listHot) {
			List<Habitacion> listaTmp= new ArrayList<>();
			
			for (Habitacion ha : h.getHabitaciones()) {
				if(ha.getTipo().equals(tipoHabitacion)){
					listaTmp.add(ha);
				}
			}
			h.getHabitaciones().size();
			
		}
		
		return listHot;
		
	}

	
	//hotle sin ningun hab
	//habitacion sin padre(hotel)
	@Override
	public List<Hotel> BuscarHotelLeftJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery= this.entityManager.createQuery("SELECT h FROM Hotel h  LEFT JOIN h.habitaciones ha WHERE ha.tipo= :datoTipo ",Hotel.class) ;
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		List<Hotel> listHot= myQuery.getResultList();
		for (Hotel h : listHot) {
			h.getHabitaciones().size();
		}
		
		return listHot;
		
	}

	@Override
	public List<Hotel> BuscarHotelRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery= this.entityManager.createQuery("SELECT h FROM Hotel h  right JOIN h.habitaciones ha WHERE ha.tipo= :datoTipo ",Hotel.class) ;
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		
		List<Hotel> listHot= myQuery.getResultList();
		/*
		for (Hotel h : listHot) {
			h.getHabitaciones().size();
		}
		*/
		return listHot;
	}

	@Override
	public List<Hotel> BuscarHotelFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> BuscarHotelJoinFetch(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
