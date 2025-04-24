package com.carlos;

public enum AddType {
    // Acompañamiento que se le puede agregar a un plato
    ARROZ("Arroz"),
    ENSALADA("Ensalada"),
    PAPAS("Papas"),
    VERDURAS("Verduras");

    private String nombre;

    AddType(String nombre) {
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