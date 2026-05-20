package com.order.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }