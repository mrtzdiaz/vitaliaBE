package com.vitalia.vitaliaBE.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
    private Long id; 
	@Column(nullable=false)
	private String status;
	@Column(nullable=false)
	private Date fechaPedido;
	@Column(nullable=false)
	private Date fechaentrega;
	@Column(nullable=false)
	private String formaDePago;
	public Pedido() {
		
	}
	
	public Pedido(String status, Date fechaPedido, Date fechaentrega, String formaDePago) {
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
