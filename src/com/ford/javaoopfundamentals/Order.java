package com.ford.javaoopfundamentals;

public class Order {
    private Customer customer;
    private ShopppingCart cart;
    private Payment payment;

    public Order(Customer customer, ShopppingCart cart, Payment payment) {
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;

    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", cart=" + cart +
                ", payment=" + payment +
                '}';
    }
}
