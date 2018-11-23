package com.sda.javapoz11.hellospring.hellospring.repository;

import com.sda.javapoz11.hellospring.hellospring.entity.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
    //List<Payment> findByClientAndPrice(String client, Integer price);
}
