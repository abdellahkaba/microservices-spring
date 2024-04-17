package com.example.payementservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payement {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payementId ;
    private String status ;
    private String transactionId ;
    private int orderId;
    private double amount ;

}
