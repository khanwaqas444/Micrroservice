package com.ai4fintech.product.product;

import java.math.BigDecimal;

public record ProductPurchaseResponse(

        Integer productId,

        String name,

        String description,

        BigDecimal price,

        double quantity
) {
}