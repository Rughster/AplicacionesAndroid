package com.L20291001.myfirstapplication.usuario.model;

public class Usuario {
    private String usuario;
    private String pass;
    private String nombre;
    private Integer edad;
    private String email;

    public Usuario(String usuario, String pass, String nombre, Integer edad, String email) {
        this.usuario = usuario;
        this.pass = pass;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
