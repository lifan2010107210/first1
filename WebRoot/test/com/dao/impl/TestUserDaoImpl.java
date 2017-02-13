package com.dao.impl;

import java.util.List;

import org.junit.Test;

import com.dao.IUserDao;
import com.entity.UserInfo;

public class TestUserDaoImpl {
	
	@Test
	public void testQuery(){
		UserInfo ui = new UserInfo("zwj@qq.com","123");
		IUserDao udao = new UserDaoImpl();
		boolean bl = udao.findUserByNamePwd(ui);
		System.out.println(bl);
	}
	
	@Test
	public void testFindAllUsers(){
		IUserDao udao = new UserDaoImpl();
		List<UserInfo> list = udao.findAllUsers();
		System.out.println(list);
	}
}
