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
    String password;
    String cantidadOfertas;
    String ofertasConcretadas;

    public Cliente(String nombres, String apellidoPaterno, String apellidoMaterno, String dni, String email) {
        super(nombres, apellidoPaterno, apellidoMaterno, dni, email);
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
