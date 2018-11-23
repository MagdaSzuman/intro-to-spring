package com.sda.javapoz11.hellospring.hellospring.service;

import com.sda.javapoz11.hellospring.hellospring.entity.Payment;
import com.sda.javapoz11.hellospring.hellospring.repository.PaymentRepository;

import java.util.ArrayList;
import java.util.List;

public interface PaymentActions {
    Payment findById(long id);

    void addPayment(String client, Double price);
}
