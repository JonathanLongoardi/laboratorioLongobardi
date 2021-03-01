package com.company;

public class Hijos extends Persona{
    private String escuela;

    public Hijos(String nombre, String apellido, int edad, String escuela){
        super(nombre, apellido, edad);
        this.escuela = escuela;
    }

    public String getEscuela(){return this.escuela;}
}
