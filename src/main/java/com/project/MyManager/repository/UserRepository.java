package com.project.MyManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MyManager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
