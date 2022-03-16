package com.Accounts.Bank.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class PersonalAccount {
    @Id
    private String idAccount;

    private String name;

    private String typeAccount;

    private Float maintenanceCommission;

    private Integer maxMonthlyMovements;

    private Integer uniqueMovementDay;

}
