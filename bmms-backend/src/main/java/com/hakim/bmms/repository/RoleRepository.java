package com.hakim.bmms.repository;

import com.hakim.bmms.entity.RoleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleInfo, Integer> {

    Optional<RoleInfo> findByRoleCode(String roleCode);

    boolean existsByRoleCode(String roleCode);

}