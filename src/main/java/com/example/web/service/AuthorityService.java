package com.example.web.service;

import com.example.web.entity.Authority;

import java.util.List;

public interface AuthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer id);
}
