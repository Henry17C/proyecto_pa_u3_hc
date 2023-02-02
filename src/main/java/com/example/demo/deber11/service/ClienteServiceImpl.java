package com.example.demo.deber11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.deber11.modelo.Cliente;
import com.example.demo.deber11.repo.IClienteRepo;


@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepo.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente buscar(String cedula ) {
		// TODO Auto-generated method stub
		return clienteRepo.buscar(cedula);
	}

	@Override
	public void borrar(String cedula ) {
		// TODO Auto-generated method stub
		clienteRepo.borrar(cedula);	
	}

}
