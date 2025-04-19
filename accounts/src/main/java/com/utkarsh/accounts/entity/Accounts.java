package com.utkarsh.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {
    @Column(name = "customer_id")
    private Long customerId;            // Foreign Key
    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
