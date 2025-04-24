package com.carlos.Adapters;

import com.carlos.Models.KitchenSystem;
import com.carlos.Models.Order;

public class JsonToXmlAdapter implements KitchenAdapter {
    private KitchenSystem kitchenSystem;

    public JsonToXmlAdapter(KitchenSystem kitchenSystem) {
        this.kitchenSystem = kitchenSystem;
    }

    @Override
    public void sendOrder(Order order) {
        String xml = "ordenXML";
        kitchenSystem.receiveOrder(xml);
    }
}