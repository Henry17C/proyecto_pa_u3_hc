package com.example.demo.deber11.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name="renta")
public class Renta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_seq")//generarlo como secuencia
	@SequenceGenerator(name = "rent_seq", sequenceName = "rent_seq", allocationSize = 1)
	@Column(name="rent_id")
	private Integer id;	
	
	@Column(name = "rent_cedula")	
	private String celula;

	@Column(name = "rent_placa")
	private String placa;

	@ManyToOne
	@JoinColumn(name = "rent_clie")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name="rent_vehi")
	private Vehiculo vehiculo;
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCelula() {
		return celula;
	}

	public void setCelula(String celula) {
		this.celula = celula;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}





}
