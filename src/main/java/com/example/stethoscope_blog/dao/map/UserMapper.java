package com.example.stethoscope_blog.dao.map;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface UserMapper {
    public List<Map<String,Object>> findUserList();
}
