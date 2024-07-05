package com.vitalia.vitaliaBE.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detallespedido")
public class DetallesPedido {
	
	@Id
    private Long id; 
    private double total;
    private int cantidadOrdenada;
    private double precio;
    private int idPedido;
    private int idUsuario;
    private int idProducto;
    private int idCategoria;

    // Constructor vacío
    public DetallesPedido() {
    	
    }

    // Constructor con campos
    public DetallesPedido(double total, int cantidadOrdenada, double precio, int idPedido, int idUsuario, int idProducto, int idCategoria) {
        super();
        this.total = total;
        this.cantidadOrdenada = cantidadOrdenada;
        this.precio = precio;
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
       
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

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "DetallePedido [id=" + id + ", total=" + total + ", cantidadOrdenada=" + cantidadOrdenada + ", precio=" + precio
                + ", idPedido=" + idPedido + ", idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", idCategoria=" + idCategoria + "]";
    }

}
