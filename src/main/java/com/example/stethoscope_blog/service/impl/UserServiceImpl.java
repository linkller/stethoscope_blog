package com.example.stethoscope_blog.service.impl;

import com.example.stethoscope_blog.dao.map.UserMapper;
import com.example.stethoscope_blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userDao;

    @Override
    public List<Map<String, Object>> findUserList() {
        return userDao.findUserList();
    }


}
