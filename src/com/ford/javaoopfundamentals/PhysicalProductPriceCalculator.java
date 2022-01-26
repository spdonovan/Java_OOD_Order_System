package com.ford.javaoopfundamentals;

import java.util.Map;

import static com.ford.javaoopfundamentals.PhysicalProduct.ShippingCategory;
import static com.ford.javaoopfundamentals.PhysicalProduct.ShippingCategory.*;

public class PhysicalProductPriceCalculator implements PriceCalculator {

    private static final int BULK_COST_FACTOR = 1;
    private static final int STANDARD_COST_FACTOR = 10;
    private static final int PREMIUM_COST_FACTOR = 10;
    private PhysicalProduct product;

    private final Map<ShippingCategory, Integer> shippingCostFactors = Map.of(
        BULKY, BULK_COST_FACTOR,
            STANDARD, STANDARD_COST_FACTOR,
                PREMIUM, PREMIUM_COST_FACTOR);

    public PhysicalProductPriceCalculator(PhysicalProduct product) {
        this.product = product;
    }

    @Override
    public int calculatePrice(int quantity) {
        int weight = product.getWeight();
        ShippingCategory shippingCategory = product.getShippingCategory();
        int shippingCosts = shippingCostFactors.get(shippingCategory) * weight;
        return quantity * ( shippingCosts +
                Math.round((1 - product.getProductDiscount())
                        * product.getBasePrice()));
    }

}
