package com.ford.javaoopfundamentals;


import java.util.Map;
import static com.ford.javaoopfundamentals.ProductType.*;

public class Catalogue {

    public final static int SHIPPING_RATE = 5;

    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new PhysicalProduct("Electric Toothbrush", 6550, 400),
            "Cat Food", new PhysicalProduct("Tuna CatFood", 350, 500),
            "Animal Farm (e-book)", new DigitalProduct("Animal Farm - Orwell", 750));

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
