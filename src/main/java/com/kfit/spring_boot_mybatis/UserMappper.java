package com.kfit.spring_boot_mybatis;

import java.util.List;

import com.kfit.spring_boot_mybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface UserMappper {
	
	//#{name}:参数占位符
	/*@Select("select *from Demo where name=#{name}")
	public List<Demo> likeName(String name);
	
	

	
	@Select("select name from Demo where id = #{id}")
	public String getNameById(long id);*/

	
	/**
	 * 保存数据.
	 */
	@Insert("insert into user(user_name) values(#{userName})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	public void save(User user);


	@Select("select * from user where user_name = #{userName}")
	public User getByUserName(String  userName);
	
}
