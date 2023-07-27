package com.sirion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirion.entity.UserBean;
import com.sirion.repo.UserBeanRepo;

@Service
public class UserService {
	@Autowired
	private UserBeanRepo uRepo;
	
	public List<UserBean> addUser(UserBean user){
		Optional<UserBean> op=uRepo.findById(user.getUname());
		if(op.isPresent()) {
			return null;
		}
		else {
			uRepo.saveAndFlush(user);
			return uRepo.findAll();
		}
	}
}
