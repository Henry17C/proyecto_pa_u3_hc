package com.example.demo.unidad3.repo;

import java.util.List;

import com.example.demo.unidad3.modelo.Hotel;

public interface IHotelRepository {
	
	public List<Hotel> BuscarJotelInnerJoin(String tipoHabitacion);

}
