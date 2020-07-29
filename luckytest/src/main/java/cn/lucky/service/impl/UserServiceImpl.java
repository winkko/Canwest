package cn.lucky.service.impl;

import cn.lucky.mapper.UserMapper;
import cn.lucky.pojo.User;
import cn.lucky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User doLogin(String username, String password) {
        return userMapper.doLogin(username,password);
    }

    @Override
    public boolean ins(User user) {
        return userMapper.ins(user)>0;
    }
}
