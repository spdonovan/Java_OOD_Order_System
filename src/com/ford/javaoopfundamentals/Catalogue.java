package com.ford.javaoopfundamentals;


import java.util.Map;
import static com.ford.javaoopfundamentals.ProductType.*;

public class Catalogue {

    public final static int SHIPPING_RATE = 50;

    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 6550, PHYSICAL, 400),
            "Cat Food", new Product("Tuna CatFood", 350, PHYSICAL, 500),
            "Animal Farm (e-book)", new Product("Animal Farm - Orwell", 750, DIGITAL, -1));

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
