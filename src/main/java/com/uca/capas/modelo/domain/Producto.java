package com.uca.capas.modelo.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Producto {
	
	@Size(min=1, max=100, message = "El campo nombre debe tener una longitud entre 1 y 100 caracteres.")
	String nombre;
	
	@Size(min=1, max=100, message = "El campo marca debe tener una longitud entre 1 y 100 caracteres.")
	String marca;
	
	@Pattern(regexp="[\\d]{12}", message = "El campo codigo debe tener una longitud exacta de 12 dígitos.")
	String  codigo;
	
	@Size(min=1, max=500, message = "El campo descripcion debe tener una longitud entre 1 y 500 caracteres.")
	String descripcion;
	
	@NotEmpty
	@Pattern(regexp="[0-9]+$", message = "El campo existencia debe ser un numero entero.")
	String existencia;
	
	
	@NotEmpty(message = "El campo fecha no puede estar vacio.")
	@DateTimeFormat(pattern = "dd/mm/yyyy",  style=" Este campo fecha debe tener formato dd/mm/yyyy ")
	String fecha;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencia() {
		return existencia;
	}

	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
}
