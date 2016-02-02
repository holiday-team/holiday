package com.hteam.holiday.region.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hteam.holiday.region.domain.Region;

public class RegionDaoImpl implements RegionDao {

	private SqlSessionFactory sqlSessionFactoryBean;
	
	public void saveRegion(Region region) {
		
		System.out.println(sqlSessionFactoryBean.getConfiguration().getMappedStatements());
		SqlSession session = sqlSessionFactoryBean.openSession();
		session.insert("holiday_region.insertRegion", region);
		session.close();
	}

	public void setSqlSessionFactoryBean(SqlSessionFactory sqlSessionFactoryBean) {
		this.sqlSessionFactoryBean = sqlSessionFactoryBean;
	}

}
