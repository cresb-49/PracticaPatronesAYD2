package com.carlos.Types;

public enum PlatoType {
    SOPA("Sopa"),
    ENSALADA("Ensalada"),
    PASTA("Pasta"),
    CARNE("Carne"),
    PESCADO("Pescado");

    private String nombre;
    PlatoType(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return nombre;
    }
}
