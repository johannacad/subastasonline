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
public class Cliente extends Persona{
    int idCliente;
    String password;
    String cantidadOfertas;
    String ofertasConcretadas;

    public Cliente(
            int idCliente,
            String password,
            String cantidadOfertas,
            String ofertasConcretadas,
            int idPersona,
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            String dni,
            String email,
            String fechaNacimiento
    ) {
        super(idPersona, nombres, apellidoPaterno, apellidoMaterno, dni, email, fechaNacimiento);
        this.idCliente = idCliente;
        this.password = password;
        this.cantidadOfertas = cantidadOfertas;
        this.ofertasConcretadas = ofertasConcretadas;
        this.idPersona = idPersona;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCantidadOfertas() {
        return cantidadOfertas;
    }

    public void setCantidadOfertas(String cantidadOfertas) {
        this.cantidadOfertas = cantidadOfertas;
    }

    public String getOfertasConcretadas() {
        return ofertasConcretadas;
    }

    public void setOfertasConcretadas(String ofertasConcretadas) {
        this.ofertasConcretadas = ofertasConcretadas;
    }
}
