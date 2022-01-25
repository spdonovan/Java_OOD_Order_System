package com.ford.javaoopfundamentals;

import static com.ford.javaoopfundamentals.Catalogue.SHIPPING_RATE;

public enum ProductType {
    DIGITAL(0), PHYSICAL(SHIPPING_RATE);

    private final int shippingRate;

    ProductType(int shippingRate) { this.shippingRate = shippingRate; }

    public int getShippingCost(int weight) {
        return shippingRate * weight;
    }
}
