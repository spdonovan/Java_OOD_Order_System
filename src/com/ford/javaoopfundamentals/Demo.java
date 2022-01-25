package com.ford.javaoopfundamentals;

public class Demo {
    public static void main(String[] args) {
        ShopppingCart cart = new ShopppingCart();
                Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
                Product catfood = Catalogue.getProduct("Cat Food");
                cart.addProduct(toothbrush);
                cart.addProduct(catfood);
                System.out.println(cart);
                System.out.println(cart.getTotalCost());

    }
}
