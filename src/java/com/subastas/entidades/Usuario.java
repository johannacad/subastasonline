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
public class Usuario extends Persona{
    int idUsuario;
    String usuario;
    String password;
    int idTipoUsuario;

    public Usuario(
            int idUsuario,
            String usuario,
            String password,
            int idPersona,
            int idTipoUsuario,
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            String dni, String email,
            String fechaNacimiento
    ) {
        super(idPersona, nombres, apellidoPaterno, apellidoMaterno, dni, email, fechaNacimiento);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
}
