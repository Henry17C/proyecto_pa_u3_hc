package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.deber11.modelo.Cliente;
import com.example.demo.deber11.modelo.Vehiculo;
import com.example.demo.deber11.repo.IVehiculoRepo;
import com.example.demo.deber11.service.IClienteService;
import com.example.demo.deber11.service.IRentaService;
import com.example.demo.deber11.service.IVehiculoService;
import com.example.demo.unidad3.modelo.Estudiante;
import com.example.demo.unidad3.service.IEstudianteService;



@SpringBootApplication
public class ProyectoPaU3HcApplication implements CommandLineRunner {

	@Autowired 
	IEstudianteService estudianteService;
	
	@Autowired
	IVehiculoService iVehiculoService;
	@Autowired
	IClienteService clienteService;
	@Autowired
	IRentaService iRentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	
	 //TELLER 25
		//Estudiante estu1= estudianteService.buscarPorApellido("Coyago");
		Estudiante estu2= estudianteService.buscarPorNombre("Jose");
		
		//System.out.println(estu1);
		System.out.println(estu2);
		
	*/
		
		//DEBER 11
		
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setAnio(1986);
		vehiculo.setColor("Rojo");
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("NFS175");
		
		
		Cliente  cliente= new Cliente();
		cliente.setAnioNacimiento(1979);
		cliente.setNombre("Mario");
		cliente.setApellido("Viteri");
		cliente.setCedula("172134");
		
		iVehiculoService.insertar(vehiculo);
		clienteService.insertar(cliente);
	
		iRentaService.rentar("172134", "NFS175");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
