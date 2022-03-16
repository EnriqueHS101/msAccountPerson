package com.Accounts.Bank.Controller;

import com.Accounts.Bank.Model.PersonalAccount;
import com.Accounts.Bank.Service.AccountsBankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/AccountsBank")
@RequiredArgsConstructor
public class ControllerAccountsBank {
    private final AccountsBankService service;

    @GetMapping
    public Flux<PersonalAccount>findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<PersonalAccount> findById(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping
    public Mono<PersonalAccount> save(@RequestBody PersonalAccount p){
        return service.save(p);
    }

    @PutMapping
    public Mono<PersonalAccount> put(@RequestBody PersonalAccount p){
        return service.save(p);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        return service.deleteById(id);
    }

    @GetMapping("/find/{name}")
    public Mono<PersonalAccount> findByName(@PathVariable String name){
        return service.findByName(name);
    }

}
