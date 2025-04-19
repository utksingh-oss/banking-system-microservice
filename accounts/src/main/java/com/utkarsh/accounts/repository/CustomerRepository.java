package com.utkarsh.accounts.repository;

import com.utkarsh.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByMobileNumber(String mobileNumber);

    Optional<Customer> findByMobileNumberAndName(String mobileNumber, String name);
}

