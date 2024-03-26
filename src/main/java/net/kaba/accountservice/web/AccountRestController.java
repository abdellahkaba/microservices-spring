package net.kaba.accountservice.web;


import lombok.AllArgsConstructor;
import net.kaba.accountservice.entities.BankAccount;
import net.kaba.accountservice.repository.BankAccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountRestController {

    private BankAccountRepository bankAccountRepository ;
    @GetMapping("/accounts")
    public List<BankAccount> accountList () {
        return bankAccountRepository.findAll() ;
    }
    @GetMapping("/accounts/{id}")
    public BankAccount bankAccountById(@PathVariable String id){
        return bankAccountRepository.findById(id).get() ;
    }
}
