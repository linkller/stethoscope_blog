package com.example.stethoscope_blog.dao.map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LogMapper {
    public  void addLog(@Param("user_id") String user_id,@Param("log")String log);
}
