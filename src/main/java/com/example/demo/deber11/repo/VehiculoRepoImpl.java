package com.example.demo.deber11.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.deber11.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository

public class VehiculoRepoImpl implements IVehiculoRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		entityManager.persist(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		entityManager.merge(vehiculo);	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return entityManager.find(Vehiculo.class, placa);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo= this.buscar(placa);
		entityManager.remove(vehiculo);
		
	}

}
