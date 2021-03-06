package com.soa.user.service; 



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soa.user.domain.User;
import com.soa.user.persistence.UserMapper;

@Service
public class UserService {
    
    @Resource
    private UserMapper userMapper;
    
    public Integer login(String userName,String password){
	return this.userMapper.login(userName, password);
    }
    
    
}
 