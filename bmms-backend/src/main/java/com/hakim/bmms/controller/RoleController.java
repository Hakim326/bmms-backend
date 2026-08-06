package com.hakim.bmms.controller;

import com.hakim.bmms.entity.RoleInfo;
import com.hakim.bmms.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleInfo> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public RoleInfo getRoleById(@PathVariable Integer id) {
        return roleService.getRoleById(id);
    }
}