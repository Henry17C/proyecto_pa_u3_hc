package com.example.demo.unidad3.service;

import java.util.List;

import com.example.demo.unidad3.modelo.Habitacion;

public interface IHabitacioService {
	public List<Habitacion> BuscarHotelLeftJoin( );
	public List<Habitacion> BuscarHotelRightJoin( );
	public List<Habitacion> BuscarHotelFullJoin( );

}
