package com.movie.user.pc.change;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.movie.user.User;

/**
 * 对会员的头像，名称，密码进行修改
 * @author QQ546
 *
 */
@Mapper
public interface ChangeMapper {
	
	@Update("update vip set vip_name = #{vip_name}, vip_pic = #{vip_pic}, vip_password = #{vip_password} where vip_id = #{vip_id}")
	public void change(User u);
	
}
