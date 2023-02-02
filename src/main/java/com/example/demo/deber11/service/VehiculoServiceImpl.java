package com.example.demo.deber11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.deber11.modelo.Vehiculo;
import com.example.demo.deber11.repo.IVehiculoRepo;


@Service
public class VehiculoServiceImpl implements IVehiculoService{

	
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		iVehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return iVehiculoRepo.buscar(placa);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		iVehiculoRepo.eliminar(placa);
	}
	
	

}
