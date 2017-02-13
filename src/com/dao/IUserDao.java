package com.dao;

import java.util.List;

import com.entity.UserInfo;

/**
 * 专门用于处理用户的数据访问层接口
 * @author dhc
 * @version V1.0
 */
public interface IUserDao {
	/**
	 * 通过登录名和密码查询用户
	 * @param ui 传入的用户
	 * @return 是否存在该用户
	 */
	public boolean findUserByNamePwd(UserInfo ui );

	public List<UserInfo> findAllUsers();

	public int deteleUserById(int userId);

	public UserInfo findUserById(int userId);

	public int updateUser(UserInfo ui);

	public int addUser(UserInfo ui);
}
