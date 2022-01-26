package com.ford.javaoopfundamentals;

public class HighValuePayment implements PaymentIntf {

    private final PaymentIntf payment;

    public HighValuePayment(PaymentIntf payment) {
        this.payment = payment;
    }

    @Override
    public void execute() {
        // verify this payment
        payment.execute();
    }

    @Override
    public int getValue() {
        return payment.getValue();
    }

    @Override
    public void setValue(int value) {
        payment.setValue(value);
    }

    @Override
    public String toString() {
        return "HighValuePayment{" +
                "payment=" + payment +
                '}';
    }

}
