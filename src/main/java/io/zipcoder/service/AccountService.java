package io.zipcoder.service;


import io.zipcoder.domain.Account;
import io.zipcoder.repositories.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@Service
public class AccountService {
    @Inject
    private AccountRepository accountRepository;


    public ResponseEntity<Iterable<Account>> getAllAccounts() {
        Iterable<Account> allAccounts = accountRepository.findAll();
        return new ResponseEntity<>(allAccounts, HttpStatus.OK);
    }

    public Account getAccount(Long id) {
        return accountRepository.findOne(id);
    }

    public ResponseEntity<Iterable<Account>> getAllAccountsByCustomerId() {
        Iterable<Account> allAccounts = accountRepository.findAll();
        return new ResponseEntity<>(allAccounts, HttpStatus.OK);
    }


}





