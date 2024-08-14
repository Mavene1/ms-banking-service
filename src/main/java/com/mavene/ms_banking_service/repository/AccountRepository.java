package com.mavene.ms_banking_service.repository;

import com.mavene.ms_banking_service.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
