package com.example.web.dao;

import com.example.web.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, String> {
//	@Query(value = "SELECT count(c.id) FROM Categories c", nativeQuery = true)
//	Integer countAllCategory();
}
