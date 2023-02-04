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

		

		Estudiante estu1= estudianteService.buscarPorNombreQueryTyped("Jose");
		Estudiante estu2= estudianteService.buscarPorNombreNamedQuery("Jose");
		Estudiante estu3=estudianteService.buscarPorNombreNamedQueryTyped("Jose");
		Estudiante estu4=estudianteService.buscarPorNombreNativeQuery("Jose");
	//	Estudiante estu5=estudianteService.buscarPorNombreNativeQueryTypedNamed("Jose");
		
			
		System.out.println(estu1);
		System.out.println(estu2);
		System.out.println(estu3);
		System.out.println(estu4);
	//	System.out.println(estu5);
	
		
		
		
		
		
		
		
		
	}

}
