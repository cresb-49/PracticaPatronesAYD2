package com.carlos;

import java.util.List;

public class Orden {
    private PlatoType plato;
    private AddType acompañamiento;
    private BebidaType bebida;
    private List<ExtraType> extras;

    public Orden(){
        this.extras = List.of();
    }

    /**
     * @return the plato
     */
    public PlatoType getPlato() {
        return plato;
    }

    /**
     * @param plato the plato to set
     */
    public void setPlato(PlatoType plato) {
        this.plato = plato;
    }

    /**
     * @return the bebida
     */
    public BebidaType getBebida() {
        return bebida;
    }

    /**
     * @param bebida the bebida to set
     */
    public void setBebida(BebidaType bebida) {
        this.bebida = bebida;
    }

    /**
     * @return the extras
     */
    public List<ExtraType> getExtras() {
        return extras;
    }

    /**
     * @param extras the extras to set
     */
    public void setExtras(List<ExtraType> extras) {
        this.extras = extras;
    }

    /**
     * @param extra the extra to add
     */
    public void addExtra(ExtraType extra) {
        this.extras.add(extra);
    }

    /**
     * @return the acompañamiento
     */
    public AddType getAcompañamiento() {
        return acompañamiento;
    }

    /**
     * @param acompañamiento the acompañamiento to set
     */
    public void setAcompañamiento(AddType acompañamiento) {
        this.acompañamiento = acompañamiento;
    }

}
