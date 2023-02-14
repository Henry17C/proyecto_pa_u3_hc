package com.example.demo.unidad3.modelo;

import java.util.List;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Fetch;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hote_sec")//generarlo como secuencia
	@SequenceGenerator(name = "hote_sec", sequenceName = "hote_sec", allocationSize = 1)
	@Column(name = "hote_id")
	private Integer id;
	

	@Column(name = "hote_nombre")
	private String nombre;
	
	
	@Column(name = "hote_direccion")
	private String direccion;
	
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	private List<Habitacion> habitaciones;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}


	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}


	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion 
				+ "]";
	}
	
	
	

}
