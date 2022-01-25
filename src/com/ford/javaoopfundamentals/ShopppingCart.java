package com.ford.javaoopfundamentals;

import java.util.ArrayList;
import java.util.List;

public class ShopppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalCost() {
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShopppingCart{" +
                "products=" + products +
                '}';
    }
}
