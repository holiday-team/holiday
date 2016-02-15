package com.hteam.holiday.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hteam.holiday.user.domain.User;

public class UserDaoImpl implements UserDao{

	private SqlSessionFactory sqlSessionFactoryBean;
	
	public void save(User user) {
		SqlSession session = sqlSessionFactoryBean.openSession();
		session.insert("holiday_user.insertUser", user);
		session.close();
	}

	public void setSqlSessionFactoryBean(SqlSessionFactory sqlSessionFactoryBean) {
		this.sqlSessionFactoryBean = sqlSessionFactoryBean;
	}

	
}
