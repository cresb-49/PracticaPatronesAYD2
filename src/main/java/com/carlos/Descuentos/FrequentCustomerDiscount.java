package com.carlos.Descuentos;

import com.carlos.Models.Order;

public class FrequentCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(Order order) {
        return 0.10;
    }
}