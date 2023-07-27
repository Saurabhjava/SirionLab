package com.sirion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirion.entity.UserBean;

public interface UserBeanRepo extends JpaRepository<UserBean,String>{

}
