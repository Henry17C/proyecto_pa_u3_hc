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
import com.example.demo.unidad3.service.IHabitacioService;
import com.example.demo.unidad3.service.IHotelService;



@SpringBootApplication
public class ProyectoPaU3HcApplication implements CommandLineRunner {

	@Autowired 
	IHotelService hotelService;
	
	@Autowired
	IHabitacioService habitacioService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		//TALLER 29 UPDATE AND DELETE
		//System.out.println(estudianteService.actualizarPorApellido("Lopez", "Max"));
		//System.out.println(estudianteService.eliminarPorApellido("Lopez"));
		
		
		//FETCH
		//fetch: traida bajo demanda cuando los datos no son consistentes
		System.out.println("**FETCH");
		List<Hotel> listHo= hotelService.BuscarHotelInnerJoin("VIP");
		
			for (Hotel h : listHo) {
				System.out.println("Hotel "+h.getNombre());
			for (Habitacion hab : h.getHabitaciones()) {
				System.out.println("Las Habitaciones de "+hab.getNumero());
			}
			}
		
			
			System.out.println("**JOIN FETCH");
			
			List<Hotel> listHtl= hotelService.BuscarHotelJoinFetch("VIP");
			
			for (Hotel h : listHtl) {
				System.out.println("Hotel "+h.getNombre());
			for (Habitacion hab : h.getHabitaciones()) {
				System.out.println("Las Habitaciones de "+hab.getNumero());
			}
			}

		
		
		//JOIN
			System.out.println("**Sin parametros Hotel LEFT");//LEFT
		List<Hotel> listH= hotelService.BuscarHotelLeftJoin();
		
		for (Hotel h : listH) {
			System.out.println("Hotel "+h.getNombre());
			for (Habitacion hab : h.getHabitaciones()) {
				System.out.println("Las Habitaciones de "+hab.getNumero());
			}
	
		}
		
		
		
		System.out.println("**Sin parametros Habitacion LEFT");//LEFT
		List<Habitacion> listHab= habitacioService.BuscarHotelLeftJoin();
		
		for (Habitacion ha : listHab) {
			System.out.println(ha!=null? "Habitaciones numero "+ha.getNumero():null);
			
		}
		
		
		
		
		System.out.println("**Sin parametros Hotel RIGHT");//RIGHT
		List<Hotel> listHote= hotelService.BuscarHotelRightJoin();
		
		for (Hotel h : listHote) {
			System.out.println(h!=null?"Hotel "+h.getNombre():null);
		}
		
		
		
		System.out.println("**Sin parametros Habitacion RIGHT");//LEFT
		List<Habitacion> listHabi= habitacioService.BuscarHotelRightJoin();
		
		for (Habitacion ha : listHabi) {
			System.out.println(ha!=null? "Habitaciones numero "+ha.getNumero():null);
			System.out.println(ha.getHotel());
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
