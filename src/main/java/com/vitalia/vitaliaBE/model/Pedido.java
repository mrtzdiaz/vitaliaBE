package com.vitalia.vitaliaBE.model;

import java.util.Date;

public class Pedido {
	
	private Long id;
	private String status;
	private Date fechaPedido;
	private Date fechaentrega;
	private String formaDePago;
	
	public Pedido() {
		
	}
	
	public Pedido(Long id, String status, Date fechaPedido, Date fechaentrega, String formaDePago) {
		super();
		this.id = id;
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

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Date getFechaentrega() {
		return fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
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
