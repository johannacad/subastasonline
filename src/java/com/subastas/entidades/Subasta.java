/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.subastas.entidades;

/**
 *
 * @author Johanna
 * La oferta puede estar abierta y completarse, asi como estar abierta y no hacerlo.
 * Tambien hay posibilidad de que el administrador decida cerrarla antes de tiempo por algun motivo.
 */
public class Subasta {
    String idSubasta;
    String idProducto;
    String fechaCreacion;
    String fechaInicio;
    String horaInicio;
    String fechaFin;
    String horaFin;
    String abierta;
    String completa;
    String precioBase;
    String precioActual;

    public Subasta(String idSubasta, String idProducto, String fechaCreacion, String fechaInicio, String horaInicio, String fechaFin, String horaFin, String abierta, String completa) {
        this.idSubasta = idSubasta;
        this.idProducto = idProducto;
        this.fechaCreacion = fechaCreacion;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.abierta = abierta;
        this.completa = completa;
    }

    public String getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(String idSubasta) {
        this.idSubasta = idSubasta;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getAbierta() {
        return abierta;
    }

    public void setAbierta(String abierta) {
        this.abierta = abierta;
    }

    public String getCompleta() {
        return completa;
    }

    public void setCompleta(String completa) {
        this.completa = completa;
    }

    public String getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(String precioBase) {
        this.precioBase = precioBase;
    }

    public String getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(String precioActual) {
        this.precioActual = precioActual;
    }


}
