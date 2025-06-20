package com.mypersonalprojects.Inventory.repositories;

import com.mypersonalprojects.Inventory.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
}
