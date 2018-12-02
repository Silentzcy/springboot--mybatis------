package com.example.springbootdemo2.mapper;

import com.example.springbootdemo2.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {
//    int deleteByPrimaryKey(Integer userId);

//    int insertSelective(User record);

//    User selectByPrimaryKey(Integer userId);

//    int updateByPrimaryKeySelective(User record);

//    int updateByPrimaryKey(User record);

    int insert(User user);

    List<User> selectAllUsers();


}