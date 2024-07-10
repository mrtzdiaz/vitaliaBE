package com.vitalia.vitaliaBE.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detallespedido")
public class DetallesPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
    private Long id; 
	@Column(nullable=false)
    private double total;
	@Column(nullable=false)
    private int cantidadOrdenada;
	@Column(nullable=false)
    private double precio;
	@Column(nullable=false)
    private Long id_pedido;
	@Column(nullable=false)
    private Long id_producto;

    // Constructor vacío
    public DetallesPedido() {
    	
    }

    // Constructor con campos
    public DetallesPedido(double total, int cantidadOrdenada, double precio, Long id_pedido, Long id_producto) {
    	super();
    	this.total = total;
    	this.cantidadOrdenada = cantidadOrdenada;
    	this.precio = precio;
    	this.id_pedido = id_pedido;
    	this.id_producto = id_producto;
    }
    

    // Getters y Setters
    public Long getId() {
        return id;
    }


	public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidadOrdenada() {
        return cantidadOrdenada;
    }

    public void setCantidadOrdenada(int cantidadOrdenada) {
        this.cantidadOrdenada = cantidadOrdenada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	@Override
	public String toString() {
		return "DetallesPedido [id=" + id + ", total=" + total + ", cantidadOrdenada=" + cantidadOrdenada + ", precio="
				+ precio + ", id_pedido=" + id_pedido + ", id_producto=" + id_producto + "]";
	}

}
