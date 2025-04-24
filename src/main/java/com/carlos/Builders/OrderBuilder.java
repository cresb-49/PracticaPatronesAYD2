package com.carlos.Builders;

import com.carlos.Models.Order;
import com.carlos.Types.AddType;
import com.carlos.Types.BebidaType;
import com.carlos.Types.ExtraType;
import com.carlos.Types.PlatoType;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder setPlato(PlatoType plato) {
        order.setPlato(plato);
        return this;
    }

    public OrderBuilder setAcompañamiento(AddType acompañamiento) {
        order.setAcompañamiento(acompañamiento);
        return this;
    }

    public OrderBuilder setBebida(BebidaType bebida) {
        order.setBebida(bebida);
        return this;
    }

    public OrderBuilder addExtra(ExtraType extra) {
        order.addExtra(extra);
        return this;
    }

    public Order build() {
        return this.order;
    }
}