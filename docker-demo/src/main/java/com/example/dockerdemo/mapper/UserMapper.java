package com.example.dockerdemo.mapper;

import com.example.dockerdemo.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * @author yunN
 * @date 2021/10/27
 */
public interface UserMapper extends CrudRepository<User, Integer> {

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "update T_USER SET name = #{#user.name}, address = #{#user.address}, age = #{#user.age} where id = #{#user.id}")
    void updateUser(@Param("user") User user);
}
