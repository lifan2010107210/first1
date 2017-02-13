package com.util;

import java.util.List;

import org.junit.Test;

public class TestJdbcUtils {

	@Test
	public void testQuery(){
		List list = JdbcUtils.query("select * from userInfo ");
		System.out.println(list.size());
	}
	
	@Test
	public void testQuery2(){
		List list = JdbcUtils.query("select * from userInfo where userId= 1 ");
		System.out.println(list.size());
	}
	
	@Test
	public void testQuerySingle(){
		int i = JdbcUtils.querySingle("select count(*) from userInfo");
		System.out.println(i);
	}
	
	@Test
	public void testQuery3(){
		List list = JdbcUtils.query("select * from userInfo where userName=? and userPwd=? ", new Object[]{"zsf@qq.com","123"});
		System.out.println(list);
	}
}
