package com.mypersonalprojects.Inventory.repositories;

import com.mypersonalprojects.Inventory.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionRepository  extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {
}
