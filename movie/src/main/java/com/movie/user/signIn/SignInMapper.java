package com.movie.user.signIn;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.movie.user.User;

@Mapper
public interface SignInMapper {
	
	// 查找账号
	@Select("select vip_phone as vipPhone from vip where vip_phone = #{vipPhone}")
	String phone();

	// 查找密码
	@Select("select vip_password as vipPassword from vip where vip_password = #{vipPassword}")
	String password();
	
	// 得到id, name ,phone
	@Select("select  vip_id as vipId, vip_name as vipName, vip_phone as vipPhone from vip where vip_name like '%${vipName}%'")
	List<User> find(@Param("vipName") String vipName);
	
	@Select("select vip_id as vipId, vip_name as vipName, vip_phone as vipPhone from vip")
	List<User> findAll();
}
