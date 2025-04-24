package com.carlos.Descuentos;

import com.carlos.Models.Order;

public interface DiscountStrategy {
    double calculateDiscount(Order order);
}