package com.example.dockerdemo.mapper;

import com.example.dockerdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yunN
 * @date 2021/10/27
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER")
    List<User> getUsers();
}
