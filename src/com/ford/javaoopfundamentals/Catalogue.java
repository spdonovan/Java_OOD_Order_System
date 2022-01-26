package com.ford.javaoopfundamentals;


import java.util.Map;

import static com.ford.javaoopfundamentals.PhysicalProduct.ShippingCategory.*;

public class Catalogue {

    public final static int SHIPPING_RATE = 5;

    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new PhysicalProduct("Electric Toothbrush", 6550, 400, STANDARD),
            "Cat Food", new PhysicalProduct("Tuna CatFood", 350, 500, STANDARD),
            "Sofa", new PhysicalProduct("Super Sofa", 50_000, 500_000, BULKY),
            "Animal Farm (e-book)", new DigitalProduct("Animal Farm - Orwell", 750));

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
