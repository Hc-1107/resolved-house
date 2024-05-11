package com.huang.service.impl;

import com.huang.dao.RoleDao;
import com.huang.entity.Role;
import com.huang.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAllRoles() {
        return roleDao.findAll();
    }

    @Override
    public void addOne(Role role) {
        roleDao.addOne(role);
    }

    @Override
    public Role getOne(Long id) {
        return roleDao.getOne(id);
    }

    @Override
    public void updateOne(Role role) {
        roleDao.updateOne(role);
    }
}
