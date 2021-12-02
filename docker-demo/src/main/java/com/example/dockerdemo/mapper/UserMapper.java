package com.example.dockerdemo.mapper;

import com.example.dockerdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author yunN
 * @date 2021/10/27
 */
@Mapper
public interface UserMapper extends CrudRepository<User, Integer> {

}
