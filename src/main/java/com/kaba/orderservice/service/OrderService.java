package com.kaba.orderservice.service;

import com.kaba.orderservice.common.Payement;
import com.kaba.orderservice.common.TransactionRequest;
import com.kaba.orderservice.common.TransactionResponse;
import com.kaba.orderservice.entity.Order;
import com.kaba.orderservice.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository repository ;

    private RestTemplate restTemplate ;
    public TransactionResponse saveOrder (TransactionRequest request) {
        String response = "" ;
        Order order = request.getOrder() ;
        Payement payement = request.getPayement() ;
        payement.setOrderId(order.getId());
        payement.setAmount(order.getPrice());
        //rest call

        Payement payementResponse =  restTemplate.postForObject("http://localhost:9191/payement/new",payement,Payement.class);
        response =  payementResponse.getStatus().equals("success") ? "payement en cour avec success and order placed" : "Il y'a un probleme" ;
        repository.save(order) ;
        return new TransactionResponse(order,payementResponse.getAmount(),payementResponse.getTransactionId(),response) ;
    }

}
