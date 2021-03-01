package com.company;
import java.util.HashSet;

public class Madre extends Persona {
    private String NombreEmpresa;
    private HashSet<Hijos> hijos;

    public Madre(String NombreEmpresa, HashSet<Hijos> hijos, String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.NombreEmpresa = NombreEmpresa;
        this.hijos = hijos;
    }
    public void agregarHijo(String nombre, String apellido, int edad, String escuela){
        Hijos nuevoHijo = new Hijos(nombre, apellido, edad, escuela);
        hijos.add(nuevoHijo);
    }
    public void verHijos(HashSet<Hijos> hijos){
        for (Hijos hijo : hijos){
            System.out.println("\nNombre: " + hijo.getNombre() + "\nApellido: " + hijo.getApellido() + "\nEdad: " + hijo.getEdad() + "\nEscuela: " + hijo.getEscuela());
        }
    }

    public void hijosMenores(HashSet<Hijos> hijos){
        for (Hijos hijo : hijos){
            if (hijo.getEdad() < 18)
                System.out.println("\nNombre: " + hijo.getNombre() + "\nApellido: " + hijo.getApellido() + "\nEdad: " + hijo.getEdad() + "\nEscuela: " + hijo.getEscuela());
        }
    }
}
