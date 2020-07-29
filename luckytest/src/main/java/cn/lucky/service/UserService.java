package cn.lucky.service;

import cn.lucky.pojo.User;

public interface UserService {
    public User doLogin(String username,String password);
    public boolean ins(User user);
}
