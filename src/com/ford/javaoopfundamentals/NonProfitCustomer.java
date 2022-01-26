package com.ford.javaoopfundamentals;

public class NonProfitCustomer extends Customer {
    public NonProfitCustomer(String name) { super(name);}

    @Override
    public int calculateDiscount() { return 15; }
}
