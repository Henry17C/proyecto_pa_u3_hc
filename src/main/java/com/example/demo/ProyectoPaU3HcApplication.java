package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
import com.example.demo.unidad3.modelo.Habitacion;
import com.example.demo.unidad3.modelo.Hotel;
import com.example.demo.unidad3.service.IEstudianteService;
import com.example.demo.unidad3.service.IHotelService;



@SpringBootApplication
public class ProyectoPaU3HcApplication implements CommandLineRunner {

	@Autowired 
	IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		//TALLER 29 UPDATE AND DELETE
		//System.out.println(estudianteService.actualizarPorApellido("Lopez", "Max"));
		//System.out.println(estudianteService.eliminarPorApellido("Lopez"));
		
		List<Hotel> listHo= hotelService.BuscarHotelInnerJoin("VIP");
		
			for (Hotel h : listHo) {
				System.out.println("Hotel "+h.getNombre());
			for (Habitacion hab : h.getHabitaciones()) {
				System.out.println("Las Habitaciones de "+hab.getNumero());
			}
			}
		
		
//		hotelService.BuscarHotelJoinFetch("VIP");
//		hotelService.BuscarHotelLeftJoin("VIP");
//		hotelService.BuscarHotelRightJoin("VIP");
//		hotelService.BuscarHotelFullJoin("VIP");
		
		
	}

}
