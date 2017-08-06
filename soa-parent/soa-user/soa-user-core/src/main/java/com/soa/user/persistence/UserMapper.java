package com.soa.user.persistence; 

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.soa.user.domain.User;


public interface UserMapper {
    public Integer login(@Param("userName") String userName, @Param("password") String password);
}
 