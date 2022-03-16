package com.Accounts.Bank.Service;

import com.Accounts.Bank.Model.PersonalAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountsBankService {
    Flux<PersonalAccount>findAll();
    Mono<PersonalAccount>findById(String id);
    Mono<PersonalAccount>save(PersonalAccount p);
    Mono<Void>deleteById(String id);
    Mono<PersonalAccount>findByName(String name);
}
