package com.sharz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharz.entity.UserEntity;

@Repository
public interface MyDao extends JpaRepository<UserEntity, Long>{
}
