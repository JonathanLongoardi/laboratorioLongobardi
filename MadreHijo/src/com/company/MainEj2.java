package com.company;

import java.util.HashSet;

public class MainEj2 {
    public static void main(String[] args) {
        HashSet<Hijos> hijos = new HashSet<Hijos>();
        Madre madre = new Madre("Carrefour", hijos, "Maria", "Gnzalez", 49);
        madre.agregarHijo("Martin", "Gonszalez", 13, "IPM");
        madre.agregarHijo("Juan", "Gonzalez", 15, "IPM");
        madre.hijosMenores(hijos);
    }
}
