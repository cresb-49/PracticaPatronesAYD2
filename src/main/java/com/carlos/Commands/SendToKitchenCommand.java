package com.carlos.Commands;

import com.carlos.Adapters.KitchenAdapter;
import com.carlos.Models.Order;

public class SendToKitchenCommand implements OrderCommand {
    private Order order;
    private KitchenAdapter adapter;

    public SendToKitchenCommand(Order order, KitchenAdapter adapter) {
        this.order = order;
        this.adapter = adapter;
    }

    @Override
    public void execute() {
        adapter.sendOrder(order);
    }

    @Override
    public void undo() {
        System.out.println("Undo: Pedido no enviado a cocina.");
    }
}