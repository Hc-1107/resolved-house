package com.huang.service;

import com.huang.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAllRoles();

    void addOne(Role role);

    Role getOne(Long id);

    void updateOne(Role role);
}
