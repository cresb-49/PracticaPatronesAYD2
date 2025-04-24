package com.carlos.Descuentos;

import com.carlos.Models.Order;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TuesdayPastaDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(Order order) {
        if (order.getPlato() != null && order.getPlato().getNombre().toLowerCase().contains("pasta")
                && LocalDate.now().getDayOfWeek() == DayOfWeek.TUESDAY) {
            return 0.15;
        }
        return 0.0;
    }
}