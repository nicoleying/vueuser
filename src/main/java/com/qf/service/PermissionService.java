package com.qf.service;

import com.qf.domain.SysPermission;

import java.util.List;

public interface PermissionService {
    List<SysPermission> findPermissionByUsername(String username);
}
