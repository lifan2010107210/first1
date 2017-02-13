package com.biz;

import java.util.List;

import com.entity.UserInfo;

/**
 * 专门用于处理用户的业务逻辑层接口
 * @author dhc
 * @version V1.0
 */
public interface IUserBiz {

	public boolean login(UserInfo ui);

	public List<UserInfo> findAllUsers();

	public int deteleUserById(int userId);

	public UserInfo findUserById(int userId);

	public int updateUser(UserInfo ui);

	public int addUser(UserInfo ui);
}
