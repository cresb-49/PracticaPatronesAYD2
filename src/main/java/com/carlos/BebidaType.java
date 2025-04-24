package com.carlos;

public enum BebidaType {
    AGUA("Agua"),
    JUGO("Jugo"),
    REFRESCO("Refresco"),
    CERVEZA("Cerveza"),
    VINO("Vino");

    private String nombre;

    BebidaType(String nombre) {
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
