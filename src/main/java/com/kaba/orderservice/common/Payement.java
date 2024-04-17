package com.kaba.orderservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payement {

    private int payementId ;
    private String status ;
    private String transactionId ;
    private int orderId;
    private double amount ;
}
