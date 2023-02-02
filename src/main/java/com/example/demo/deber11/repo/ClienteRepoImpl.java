package com.example.demo.deber11.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.deber11.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		entityManager.merge(cliente);
	}

	@Override
	public Cliente buscar(String cedula ) {
		// TODO Auto-generated method stub
		return entityManager.find(Cliente.class, cedula);
	}

	@Override
	public void borrar(String cedula ) {
		// TODO Auto-generated method stub
		Cliente cliente=this.buscar(cedula);
		entityManager.remove(cliente);
		
	}

}
