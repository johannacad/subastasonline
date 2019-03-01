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
    String color;
    String material;
    String unidadTalla;
    int talla;
    String unidadLargo;
    int largo;
    String unidadAncho;
    int ancho;

    public Producto(String nombre, String descripcion, String precioCompra, String precioVenta) {
        super(nombre, descripcion, precioCompra, precioVenta);
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
