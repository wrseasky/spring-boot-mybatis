package com.seasky.spring_boot_mybatis.dao;

import java.util.List;

import com.seasky.spring_boot_mybatis.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMappper {


    List<User> selectUsersLikeName(String userName);

    @Update("update user set user_name = #{username} where password = 'hua'")
    int updateUserName(String username);

    @Update("update user set user_name = 'zhonghua' where id = #{id}")
    int updateUserNameById(Long id);

    @Insert("insert into user(user_name) values(#{userName})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void save(User user);

    @Select("select * from user where user_name = #{userName}")
    User getByUserName(String userName);

}
