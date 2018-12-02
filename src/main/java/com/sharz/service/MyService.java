package com.sharz.service;

import com.sharz.domain.User;

public interface MyService {
	void saveUser (User user) throws Exception;
	User getUser(Long id) throws Exception;
}
