package com.example.payementservice.controller;

import com.example.payementservice.entity.Payement;
import com.example.payementservice.service.PayementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/payement")
public class PayementController {
    @Autowired

    private PayementService service ;

    @PostMapping("/new")
    public Payement doPayement (@RequestBody Payement payement) {
        return service.doPayement(payement);
    }




}
