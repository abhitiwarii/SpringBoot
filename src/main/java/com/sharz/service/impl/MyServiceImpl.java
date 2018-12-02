package com.sharz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharz.dao.MyDao;
import com.sharz.domain.User;
import com.sharz.entity.UserEntity;
import com.sharz.service.MyService;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	MyDao myDao;

	@Override
	public void saveUser(User user) throws Exception {
		// TODO Auto-generated method stub
		UserEntity userEntity = getUserEntityObj(user);
		myDao.save(userEntity);
	}

	@Override
	public User getUser(Long id) throws Exception {
		// TODO Auto-generated method stub
		UserEntity userEntity = myDao.findById(id).get();
		return getUserObj(userEntity);
	}
	
	private UserEntity getUserEntityObj(User user) {
		// TODO Auto-generated method stub
		return new UserEntity(user.getId(), user.getName(), user.getAge());
	}
	
	private User getUserObj(UserEntity userEntity) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(userEntity.getName());
		return user;
	}

}
