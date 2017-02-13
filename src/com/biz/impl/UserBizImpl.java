package com.biz.impl;

import java.util.ArrayList;
import java.util.List;

import com.biz.IUserBiz;
import com.dao.IUserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.UserInfo;

/**
 * 专门用于处理用户的业务逻辑层实现类
 * @author dhc
 * @version V1.0
 */
public class UserBizImpl implements IUserBiz {
	
	private IUserDao udao = new UserDaoImpl();

	@Override
	public boolean login(UserInfo ui) {
		boolean bl = false;
		try {
			bl = udao.findUserByNamePwd(ui);
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
			ulist = udao.findAllUsers();
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
			i = udao.deteleUserById(userId);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return i;
	}

	@Override
	public UserInfo findUserById(int userId) {
		UserInfo ui = new UserInfo();
		try {
			ui = udao.findUserById(userId);
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
			i = udao.updateUser(ui);
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
			i = udao.addUser(ui);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return i;
	}

}
