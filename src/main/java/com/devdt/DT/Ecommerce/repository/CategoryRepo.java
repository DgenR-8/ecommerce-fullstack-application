package com.devdt.DT.Ecommerce.repository;

import com.devdt.DT.Ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
