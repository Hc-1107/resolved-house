package com.huang.dao;

import com.huang.entity.Role;

import java.util.List;

public interface RoleDao {

    List<Role> findAll();

    void addOne(Role role);

    Role getOne(Long id);

    void updateOne(Role role);
}
