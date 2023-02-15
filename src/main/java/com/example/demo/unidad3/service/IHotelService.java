package com.example.demo.unidad3.service;

import java.util.List;

import com.example.demo.unidad3.modelo.Hotel;

public interface IHotelService {
	
	public List<Hotel> BuscarHotelInnerJoin(String tipoHabitacion);
	public List<Hotel> BuscarHotelLeftJoin(String tipoHabitacion);
	public List<Hotel> BuscarHotelRightJoin(String tipoHabitacion);
	public List<Hotel> BuscarHotelFullJoin(String tipoHabitacion);
	public List<Hotel> BuscarHotelJoinFetch(String tipoHabitacion);
	
	public List<Hotel> BuscarHotelLeftJoin( );
	public List<Hotel> BuscarHotelRightJoin( );
	public List<Hotel> BuscarHotelFullJoin( );



}
