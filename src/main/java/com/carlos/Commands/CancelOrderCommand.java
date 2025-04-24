package com.carlos.Commands;

public class CancelOrderCommand implements OrderCommand {
    @Override
    public void execute() {
        System.out.println("Pedido cancelado.");
    }

    @Override
    public void undo() {
        System.out.println("Undo: Cancelación revertida.");
    }
}