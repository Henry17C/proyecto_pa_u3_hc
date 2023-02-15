package com.example.demo.unidad3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.unidad3.modelo.Habitacion;
import com.example.demo.unidad3.repo.IHabitacionRepo;

@Service
public class HabitacioServiceImpl implements IHabitacioService {

	@Autowired
	IHabitacionRepo habitacionRepo;
	
	
	@Override
	public List<Habitacion> BuscarHotelLeftJoin() {
		// TODO Auto-generated method stub
		return habitacionRepo.BuscarHotelLeftJoin();
	}

	@Override
	public List<Habitacion> BuscarHotelRightJoin() {
		// TODO Auto-generated method stub
		return habitacionRepo.BuscarHotelRightJoin();
	}

	@Override
	public List<Habitacion> BuscarHotelFullJoin() {
		// TODO Auto-generated method stub
		return habitacionRepo.BuscarHotelLeftJoin();
	}

}
