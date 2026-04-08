/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siniestros.model;

public class Usuario {
    private String nombreUsuario;
    private String password;
    private String rol;

    public Usuario(String nombreUsuario, String password, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.rol = rol;
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public String getPassword() { return password; }
    public String getRol() { return rol; }
}
