package com.example.web.service.impl;

import com.example.web.dao.RoleDAO;
import com.example.web.entity.Role;
import com.example.web.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDAO dao;

	public List<Role> findAll() {
		return dao.findAll();
	}
}
