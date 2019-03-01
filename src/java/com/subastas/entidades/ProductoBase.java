/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.subastas.entidades;

/**
 *
 * @author Johanna
 */
public class ProductoBase {
    int idProductoBase;
    String nombre;
    String descripcion;
    String precioCompra;
    String precioVenta;

    public ProductoBase(int idProductoBase, String nombre, String descripcion, String precioCompra, String precioVenta) {
        this.idProductoBase = idProductoBase;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public int getIdProductoBase() {
        return idProductoBase;
    }

    public void setIdProductoBase(int idProductoBase) {
        this.idProductoBase = idProductoBase;
    }       

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

}
