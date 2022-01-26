package com.ford.javaoopfundamentals;

import java.util.Optional;

public interface PaymentMethod {
    public Optional<Payment> mkPayment(int amount);
}
