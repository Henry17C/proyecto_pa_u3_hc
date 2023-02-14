package com.example.demo.unidad3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unidad3.modelo.Hotel;
import com.example.demo.unidad3.repo.IHotelRepository;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepository hotelRepository;
	@Override
	public List<Hotel> BuscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return hotelRepository.BuscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> BuscarHotelLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return hotelRepository.BuscarHotelLeftJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> BuscarHotelRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return hotelRepository.BuscarHotelRightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> BuscarHotelFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return hotelRepository.BuscarHotelFullJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> BuscarHotelJoinFetch(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return hotelRepository.BuscarHotelJoinFetch(tipoHabitacion);
	}
	
	

}
