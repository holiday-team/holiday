package com.hteam.holiday.user.service;

import com.hteam.holiday.user.dao.UserDao;
import com.hteam.holiday.user.domain.User;

public class RegisterServiceImpl implements RegisterService {
	
	private UserDao userDao;
	
	public boolean register(User user) {
		String password = user.getPassword();
		String password1 = user.getPassword1();
		
		if(!password.equals(password1)){
			return false;
		}
		
		userDao.save(user);
		return false;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


}
