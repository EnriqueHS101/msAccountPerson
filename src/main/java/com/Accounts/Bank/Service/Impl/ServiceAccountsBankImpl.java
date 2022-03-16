package com.Accounts.Bank.Service.Impl;

import com.Accounts.Bank.Model.PersonalAccount;
import com.Accounts.Bank.Repository.AccountsBankRepository;
import com.Accounts.Bank.Service.AccountsBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceAccountsBankImpl implements AccountsBankService {

    @Autowired
    private AccountsBankRepository repository;

    @Override
    public Flux<PersonalAccount> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<PersonalAccount> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<PersonalAccount> save(PersonalAccount p) {
        return repository.save(p);
    }

    @Override
    public Mono <Void> deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<PersonalAccount> findByName(String name) {
        return repository.findByName(name);
    }

}
