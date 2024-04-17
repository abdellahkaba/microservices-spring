package com.example.payementservice.service;

import com.example.payementservice.entity.Payement;
import com.example.payementservice.repository.PayementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PayementService {

    @Autowired
    private PayementRepository repository ;

    public Payement doPayement(Payement payement) {
        payement.setStatus(payementProcessing());
        payement.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payement) ;
    }

    public  String payementProcessing () {
        return new Random().nextBoolean() ? "success" : "false" ;
    }
}
