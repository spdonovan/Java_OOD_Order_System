package com.ford.javaoopfundamentals;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
                Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
                Product catfood = Catalogue.getProduct("Cat Food");
                Product animalFarm = Catalogue.getProduct("Animal Farm (e-book)");

                ShoppingCart cart = new ShoppingCart();
                cart.addLineItem(new LineItem(catfood, 1));
                cart.addLineItem(new LineItem(animalFarm, 1));
                LineItem toothbrushes = new LineItem(toothbrush, 2);
                cart.addLineItem(toothbrushes);
                System.out.println(cart.getTotalCost());

                Customer scottDonovan = new Customer("Scott Donovan", 5432234567529854L);
                Optional<Order> order = scottDonovan.checkout(cart);
                System.out.println(order);
    }
}
