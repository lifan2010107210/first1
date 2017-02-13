package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.dao.IUserDao;
import com.entity.UserInfo;
import com.util.JdbcUtils;

/**
 * 专门用于处理用户的数据访问层实现类
 * @author dhc
 * @version V1.0
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean findUserByNamePwd(UserInfo ui) {
		boolean bl = false;
		try {
			int i = JdbcUtils.querySingle("select count(*) from userInfo where userName=? and userPwd=? ", new Object[]{ui.getUserName(),ui.getUserPwd()});
			if(i>0){
				bl = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return bl;
	}

	@Override
	public List<UserInfo> findAllUsers() {
		List<UserInfo> ulist = new ArrayList<UserInfo>();
		try {
			@SuppressWarnings("rawtypes")
			List list = JdbcUtils.query("select * from userInfo ");
			for (Object o : list) {
				ulist.add(JSON.parseObject(JSON.toJSONString(o), UserInfo.class));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return ulist;
	}

	@Override
	public int deteleUserById(int userId) {
		int i = 0;
		try {
			i = JdbcUtils.update("delete from userInfo where userId=? ", new Object[]{userId});
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return i;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public UserInfo findUserById(int userId) {
		UserInfo ui = new UserInfo();
		try {
			List list = JdbcUtils.query("select * from userInfo where userId=? ", new Object[]{userId});
			ui = JSON.parseObject(JSON.toJSONString(list.get(0)), UserInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return ui;
	}

	@Override
	public int updateUser(UserInfo ui) {
		int i = 0;
		try {
			i = JdbcUtils.update("update userInfo set userName=?,userPwd=? where userId=?  ", new Object[]{ui.getUserName(),ui.getUserPwd(),ui.getUserId()});
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return i;
	}

	@Override
	public int addUser(UserInfo ui) {
		int i = 0;
		try {
			i = JdbcUtils.update(" insert into userInfo(userName,userPwd) values(?,?) ", new Object[]{ui.getUserName(),ui.getUserPwd()});
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return i;
	}

}
