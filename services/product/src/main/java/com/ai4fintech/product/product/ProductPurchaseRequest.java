package com.ai4fintech.product.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(

        @NotNull(message = "Product is mandatory")
        Integer productId,

        @NotNull(message = "Quantity is mandatory")
        double quantity
) {
}