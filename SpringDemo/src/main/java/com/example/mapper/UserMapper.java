package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Sel(int id);
    Map<String,Object>selectMap(int id);
    List<Map<String,Object>> selectListMap();
    List<User> SelList();
    void insertUser(User user);
    void insertUserList(List<User> u);
}
