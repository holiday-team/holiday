package com.hteam.holiday.activity.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class HelloWorldDaoImpl implements HelloWorldDao{

	private SqlSessionFactory sqlSessionFactoryBean;
	
	@Override
	public List<Integer> findAllRegionId() {
		SqlSession session = sqlSessionFactoryBean.openSession();
		List<Integer> ids = session.selectList("holiday_activity.all_rid");
		session.close();
		return ids;
	}

	public void setSqlSessionFactoryBean(SqlSessionFactory sqlSessionFactoryBean) {
		this.sqlSessionFactoryBean = sqlSessionFactoryBean;
	}

	
}
