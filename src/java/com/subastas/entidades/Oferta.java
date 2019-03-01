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
public class Oferta {
    String idOferta;
    String idSubasta;
    String idCliente;
    String fecha;
    String hora;
    String monto;

    public Oferta(String idOferta, String idSubasta, String idCliente, String fecha, String hora, String monto) {
        this.idOferta = idOferta;
        this.idSubasta = idSubasta;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.monto = monto;
    }

    public String getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(String idOferta) {
        this.idOferta = idOferta;
    }

    public String getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(String idSubasta) {
        this.idSubasta = idSubasta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }



}
