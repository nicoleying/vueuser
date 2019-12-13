package com.qf.repository;

import com.qf.domain.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<SysPermission,Integer> {
}
