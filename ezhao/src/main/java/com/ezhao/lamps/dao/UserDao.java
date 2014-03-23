package com.ezhao.lamps.dao;
import java.util.List;

import com.ezhao.lamps.entity.User;


public interface UserDao {
	public List<User> findByLoginName(String loginName);
	
	public List<User> findByLoginnameAndPassword(User u);
}
