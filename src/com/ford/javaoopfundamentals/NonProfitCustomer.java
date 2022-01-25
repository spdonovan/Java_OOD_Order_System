package com.ford.javaoopfundamentals;

public class NonProfitCustomer extends Customer {
    public NonProfitCustomer(String name, long ccNumber) { super(name, ccNumber);}

    @Override
    public int calculateDiscount() { return 15; }
}
