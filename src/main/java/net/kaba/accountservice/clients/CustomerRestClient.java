package net.kaba.accountservice.clients;

import net.kaba.accountservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {

    @GetMapping("/customers/{id}")
    //cette interface permet de chercher un customer client
    Customer findCustomerById(@PathVariable Long id);
    //une methode qui return liste de customer
    @GetMapping("/customers")
    List<Customer> allCustomers() ;
}
