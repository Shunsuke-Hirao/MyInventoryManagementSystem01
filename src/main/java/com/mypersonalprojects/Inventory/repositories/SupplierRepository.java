package com.mypersonalprojects.Inventory.repositories;

import com.mypersonalprojects.Inventory.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository  extends JpaRepository<Supplier, Long> {
}
