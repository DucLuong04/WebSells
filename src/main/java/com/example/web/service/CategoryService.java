package com.example.web.service;

import com.example.web.entity.Category;

import java.util.List;

public interface CategoryService {

	List<Category> findAll();

	Category findById(String id);

	Category create(Category category);

	Category update(Category category);

	void delete(String id);

}
