package com.example.demo.unidad3.modelo.dto;

import jakarta.persistence.Column;

public class EstudianteDTO {
	//es buena preactica declara el costrucotr por defecto
	public EstudianteDTO() {
	}

	
	public EstudianteDTO(String nombre, String apellido, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	
	private String nombre;
	private String apellido;
	private String cedula;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	
	
	
	
	
	

}
