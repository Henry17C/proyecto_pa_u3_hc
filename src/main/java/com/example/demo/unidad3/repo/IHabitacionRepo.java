package com.example.demo.unidad3.repo;

import java.util.List;

import com.example.demo.unidad3.modelo.Habitacion;
import com.example.demo.unidad3.modelo.Hotel;

public interface IHabitacionRepo {

	public List<Habitacion> BuscarHotelLeftJoin( );
	public List<Habitacion> BuscarHotelRightJoin( );
	public List<Habitacion> BuscarHotelFullJoin( );

	
}
