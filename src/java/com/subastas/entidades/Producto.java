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
public class Producto extends ProductoBase {
    int idProducto;
    String color;
    String material;
    String unidadTalla;
    int talla;
    String unidadLargo;
    int largo;
    String unidadAncho;
    int ancho;

    public Producto(
        int idProducto,
        String color,
        String material,
        String unidadTalla,
        int talla,
        String unidadLargo,
        int largo,
        String unidadAncho,
        int ancho,
        int idProductoBase,
        String nombre,
        String descripcion,
        String precioCompra,
        String precioVenta
    ) {
        super(idProductoBase, nombre, descripcion, precioCompra, precioVenta);
        this.idProducto = idProducto;
        this.color = color;
        this.material = material;
        this.unidadTalla = unidadTalla;
        this.talla = talla;
        this.unidadLargo = unidadLargo;
        this.largo = largo;
        this.unidadAncho = unidadAncho;
        this.ancho = ancho;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getUnidadTalla() {
        return unidadTalla;
    }

    public void setUnidadTalla(String unidadTalla) {
        this.unidadTalla = unidadTalla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getUnidadLargo() {
        return unidadLargo;
    }

    public void setUnidadLargo(String unidadLargo) {
        this.unidadLargo = unidadLargo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getUnidadAncho() {
        return unidadAncho;
    }

    public void setUnidadAncho(String unidadAncho) {
        this.unidadAncho = unidadAncho;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
