package com.vitalia.vitaliaBE.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
    private Long id; 
	@Column(nullable=false)
	private String status;
	@Column(nullable=false)
	private Date fecha_pedido;
	@Column(nullable=false)
	private Date fecha_entrega;
	@Column(nullable=false)
	private String formaDePago;
	@Column(nullable=false)
	private Long usuario_id;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_pedido")
	List<DetallesPedido> detallespedido = new ArrayList<DetallesPedido>();
	
	public Pedido() {
		
	}
	
	public Pedido(String status, Date fecha_pedido, Date fecha_entrega, String formaDePago, Long usuario_id) {
		this.status = status;
		this.fecha_pedido = fecha_pedido;
		this.fecha_entrega = fecha_entrega;
		this.formaDePago = formaDePago;
		this.usuario_id = usuario_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFechaPedido() {
		return fecha_pedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fecha_pedido = fechaPedido;
	}

	public Date getFechaentrega() {
		return fecha_entrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fecha_entrega = fechaentrega;
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

	public Long getUsuario_id() {
		return usuario_id;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", status=" + status + ", fecha_pedido=" + fecha_pedido + ", fecha_entrega="
				+ fecha_entrega + ", formaDePago=" + formaDePago + ", usuario_id=" + usuario_id + "]";
	}


}
