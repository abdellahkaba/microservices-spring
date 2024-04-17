package com.kaba.orderservice.controller;


import com.kaba.orderservice.common.Payement;
import com.kaba.orderservice.common.TransactionRequest;
import com.kaba.orderservice.common.TransactionResponse;
import com.kaba.orderservice.entity.Order;
import com.kaba.orderservice.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private OrderService service ;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
        return service.saveOrder(request) ;
    }


}
