package com.example.demo.unidad3.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.unidad3.modelo.Habitacion;
import com.example.demo.unidad3.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class HabitacionRepoImpl implements IHabitacionRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Habitacion> BuscarHotelLeftJoin() {
		TypedQuery<Habitacion> myQuery= this.entityManager.createQuery(
				"SELECT ha FROM Hotel h  LEFT JOIN  h.habitaciones ha",Habitacion.class) ;
		
		List<Habitacion> listHab= myQuery.getResultList();
		
		/*for (Habitacion ha : listHab) {
			
			ha.getHabitaciones().size();
		}
		*/
		
		return listHab;
	}

	@Override
	public List<Habitacion> BuscarHotelRightJoin() {
		TypedQuery<Habitacion> myQuery= this.entityManager.createQuery(
				"SELECT ha FROM Hotel h  RIGHT JOIN  h.habitaciones ha",Habitacion.class) ;
		
		List<Habitacion> listHab= myQuery.getResultList();
		
		/*for (Habitacion ha : listHab) {
			
			ha.getHabitaciones().size();
		}
		*/
		
		return listHab;
	}

	@Override
	public List<Habitacion> BuscarHotelFullJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
