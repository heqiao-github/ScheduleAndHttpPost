package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    @Override
    public Map<String, Object> selectMap() {
        return userMapper.selectMap(10);
    }

    public List<User> selectList() {
        return userMapper.SelList();
    }

    @Override
    public List<Map<String, Object>> selectListMap() {
        return userMapper.selectListMap();
    }

    public void insertUser() {
        User user = new User();
        int i =0;
        user.setUserName("wangwu"+i++);
        user.setPassWord("12456987" +i++);
        user.setRealName("hqieo" + i++);
        userMapper.insertUser(user);

    }

    public void insertUserList() {
        User user = new User();
        int i =0;
        user.setUserName("yyeyeyey");
        user.setPassWord("gggggg");
        user.setRealName("hqieo");
        List<User> list = new ArrayList<>();
        list.add(user);
        user.setUserName("eeeeee");
        user.setPassWord("ggggggggg333ggg");
        user.setRealName("hqitttttteo");
        list.add(user);
        userMapper.insertUserList(list);

    }
}
