package com.example.service;

import com.example.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User Sel(int id);
    public Map<String,Object>selectMap();
    public List<User> selectList() ;
    public List<Map<String ,Object>>selectListMap();
    public void insertUser();
    public void insertUserList();
}
