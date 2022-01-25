package com.ford.javaoopfundamentals;


import java.util.Map;

public class Catalogue {
    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 6550),
            "Cat Food", new Product("Tuna CatFood", 350));

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
