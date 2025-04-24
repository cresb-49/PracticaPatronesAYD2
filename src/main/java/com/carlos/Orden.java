package com.carlos;

import java.util.List;

public class Orden {
    private String plato;
    private String bebida;
    private List<String> extras;

    public Orden(){
        this.extras = List.of();
    }

    /**
     * @return the plato
     */
    public String getPlato() {
        return plato;
    }

    /**
     * @param plato the plato to set
     */
    public void setPlato(String plato) {
        this.plato = plato;
    }

    /**
     * @return the bebida
     */
    public String getBebida() {
        return bebida;
    }

    /**
     * @param bebida the bebida to set
     */
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    /**
     * @return the extras
     */
    public List<String> getExtras() {
        return extras;
    }

    /**
     * @param extras the extras to set
     */
    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    /**
     * @param extra the extra to add
     */
    public void addExtra(String extra) {
        this.extras.add(extra);
    }

    

}
