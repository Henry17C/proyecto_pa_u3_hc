package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.unidad3.modelo.Estudiante;
import com.example.demo.unidad3.service.IEstudianteService;



@SpringBootApplication
public class ProyectoPaU3HcApplication implements CommandLineRunner {

	@Autowired 
	IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Estudiante estu1= estudianteService.buscarPorApellido("Coyago");
		Estudiante estu2= estudianteService.buscarPorNombre("Jose");
		
		//System.out.println(estu1);
		System.out.println(estu2);
		
	}

}
