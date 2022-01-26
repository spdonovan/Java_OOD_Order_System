package com.ford.javaoopfundamentals;


public class Demo {
    public static void main(String[] args) {
                Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
                Product catFood = Catalogue.getProduct("Cat Food");
                Product animalFarm = Catalogue.getProduct("Animal Farm (e-book)");
                Product sofa = Catalogue.getProduct("Sofa");

                ShoppingCart cart = new ShoppingCart();
                cart.addLineItem(new LineItem(catFood, 1));
                cart.addLineItem(new LineItem(animalFarm, 1));
                LineItem toothbrushes = new LineItem(toothbrush, 2);
                cart.addLineItem(toothbrushes);
                LineItem newSofa = new LineItem(sofa, 1);
                cart.addLineItem(newSofa);
                System.out.println(cart.getTotalCost());

    }
}
