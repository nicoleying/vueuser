package com.qf.service.impl;

import com.qf.domain.SysPermission;
import com.qf.repository.PermissionRepository;
import com.qf.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    public PermissionRepository permissionRepository;
    @Override
    public List<SysPermission> findPermissionByUsername(String username) {
        return null;
    }
}
