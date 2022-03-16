package com.Accounts.Bank.Repository;

import com.Accounts.Bank.Model.PersonalAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface AccountsBankRepository extends ReactiveMongoRepository<PersonalAccount, String> {
    Mono<PersonalAccount> findByName(String name);
}
