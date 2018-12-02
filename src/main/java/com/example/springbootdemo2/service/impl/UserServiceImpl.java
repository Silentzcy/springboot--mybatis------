package com.example.springbootdemo2.service.impl;

import com.example.springbootdemo2.mapper.UserMapper;
import com.example.springbootdemo2.model.User;
import com.example.springbootdemo2.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> user = userMapper.selectAllUsers();
        PageInfo result = new PageInfo(user);
        return result;
    }


}
