package com.carlos.Types;

public enum ExtraType {
    PAN("Pan"),
    PASTEL("Pastel"),
    FRUTA("Fruta"),
    HELADO("Helado"),
    TARTA("Tarta");

    private String nombre;
    ExtraType(String nombre) {
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
