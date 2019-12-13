package com.qf.dao;

import com.qf.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User findUserByUsername(String username);
}
