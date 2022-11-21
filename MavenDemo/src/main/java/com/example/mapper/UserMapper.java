package com.example.mapper;

import com.example.pojo.Students;
import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<Students> selectAll();
    List<Students> userMapper(@Param("name") String name);
}
