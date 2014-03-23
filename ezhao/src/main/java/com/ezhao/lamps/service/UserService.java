package com.ezhao.lamps.service;

import java.util.List;

import com.ezhao.lamps.entity.User;

public interface UserService {
	public User getUserByLoginName(String name);
	
	public List<User> findUserByLoginNameAndPwd(String loginName, String password);
}
