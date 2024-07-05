package com.vitalia.vitaliaBE.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {
	
	@Id
    private Long id; 
	private String status;
	private String fechaPedido;
	private String fechaentrega;
	private String formaDePago;
	
	public Pedido() {
		
	}
	
	public Pedido(String status, String fechaPedido, String fechaentrega, String formaDePago) {
		super();
		this.status = status;
		this.fechaPedido = fechaPedido;
		this.fechaentrega = fechaentrega;
		this.formaDePago = formaDePago;
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getFechaentrega() {
		return fechaentrega;
	}

	public void setFechaentrega(String fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "pedido [id=" + id + ", status=" + status + ", fechaPedido=" + fechaPedido + ", fechaentrega="
				+ fechaentrega + ", formaDePago=" + formaDePago + "]";
	}
	
	

}
