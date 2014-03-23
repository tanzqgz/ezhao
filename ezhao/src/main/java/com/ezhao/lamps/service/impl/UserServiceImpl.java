package com.ezhao.lamps.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ezhao.lamps.dao.UserDao;
import com.ezhao.lamps.entity.User;
import com.ezhao.lamps.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao = null;
	
	public User getUserByLoginName(String name) {
		List<User> user = userDao.findByLoginName(name);
		return user.size() > 1 ? user.get(0) : null;
	}

	@Override
	public List<User> findUserByLoginNameAndPwd(String loginName, String password) {
		User user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
		return userDao.findByLoginnameAndPassword(user);
	}
}
