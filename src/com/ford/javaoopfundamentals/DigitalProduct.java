package com.ford.javaoopfundamentals;

public class DigitalProduct extends Product {
    public DigitalProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int calculateShippingCost() {
        return 0;
    }
}
