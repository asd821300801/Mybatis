package com.lingdu.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingdu.user.dao.UserMapper;
import com.lingdu.user.domain.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public void addUser(User user) {
		mapper.add(user);
	}

	@Override
	public User getUser(Integer id) {
		return mapper.get(id);
	}

	@Override
	public void deleteUser(Integer id) {
		mapper.delete(id);
	}

	@Override
	public void updateUser(User user) {
		mapper.update(user);
	}

	@Override
	public List<User> list() {
		return mapper.list();
	}
}
