package com.hakim.bmms.service;

import com.hakim.bmms.entity.RoleInfo;

import java.util.List;

public interface RoleService {

    List<RoleInfo> getAllRoles();

    RoleInfo getRoleById(Integer roleId);

}