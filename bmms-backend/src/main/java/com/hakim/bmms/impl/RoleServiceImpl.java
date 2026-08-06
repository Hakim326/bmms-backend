package com.hakim.bmms.service.impl;

import com.hakim.bmms.entity.RoleInfo;
import com.hakim.bmms.repository.RoleRepository;
import com.hakim.bmms.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleInfo> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public RoleInfo getRoleById(Integer roleId) {
        return roleRepository.findById(roleId)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }
}