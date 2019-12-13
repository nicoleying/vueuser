package com.qf.dao;

import com.qf.domain.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysPermissionDao {
    List<SysPermission> findPermissionByUsername(@Param("username")String username);


}
