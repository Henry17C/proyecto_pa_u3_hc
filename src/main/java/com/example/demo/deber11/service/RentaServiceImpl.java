package com.example.demo.deber11.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.deber11.modelo.Cliente;
import com.example.demo.deber11.modelo.Renta;
import com.example.demo.deber11.modelo.Vehiculo;
import com.example.demo.deber11.repo.IClienteRepo;
import com.example.demo.deber11.repo.IReantaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IReantaRepo iReantaRepo;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Override
	public void rentar(String cedula, String placa) {
		// TODO Auto-generated method stub
		
		ArrayList <Renta> rentas= new ArrayList<> ();
	
		
	//BUSCAR VEHICULOS
		Cliente  cli=clienteService.buscar(cedula);
		Vehiculo vehi= iVehiculoService.buscar(placa);
		
	//ESTABLECER LA RENTA	
		Renta renta = new Renta();
		renta.setCelula(cli.getCedula());
		renta.setPlaca(vehi.getPlaca());
		
			//ASOCIAR LA RENTA A LOS VEHICULOS
			renta.setVehiculo(vehi);
			renta.setCliente(cli);
			//AGREGAR LA RENTA DE VEHICULOS A UNA LISTA DE RENTAS
			rentas.add(renta);
		//ASOCIAR LA RENTA A LOS VEHICULOS
		vehi.setRentas(rentas);
		cli.setRentas(rentas);
		
		//ACTUALIZAR LOS VEHICULOS A LA RENTA
		clienteService.actualizar(cli);
		iVehiculoService.actualizar(vehi);
		
		//INSERTAR LA RENTA
		iReantaRepo.insertar(renta);
		
		
	}

}
