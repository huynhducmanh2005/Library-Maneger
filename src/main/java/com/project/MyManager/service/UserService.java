package com.project.MyManager.service;

import org.springframework.stereotype.Service;

import com.project.MyManager.dto.request.UserRequest;
import com.project.MyManager.model.User;

@Service
public interface UserService extends BaseService<User, UserRequest, Long> {

}
