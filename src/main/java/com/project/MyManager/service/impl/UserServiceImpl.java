package com.project.MyManager.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.MyManager.dto.request.UserRequest;
import com.project.MyManager.model.User;
import com.project.MyManager.repository.UserRepository;
import com.project.MyManager.service.UserService;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void delete(long id) throws Exception {
        try {
            User user = userRepository.findById(id).orElseThrow(() -> new Exception("User not found with id " + id));
            userRepository.delete(user);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting user with id: " + id, e);

        }
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(long id) throws Exception {
        try {
            return userRepository.findById(id);
        } catch (Exception e) {
            throw new Exception("Error retrieving user with id: " + id, e);
        }
    }

    @Override
    public User creat(UserRequest userRequest) throws Exception {
        try {
            User user = new User();
            user.setEmail(userRequest.getEmail());
            user.setFirstName(userRequest.getFirstName());
            user.setLastName(userRequest.getLastName());
            user.setPassword(userRequest.getPassword());
            user.setUserCode(userRequest.getUserCode());
            user.setUserType(userRequest.getUserType());
            return userRepository.save(user);
        } catch (Exception e) {
            throw new Exception("Error creating user: " + e.getMessage(), e);
        }
    }

    @Override
    public User update(long id, UserRequest userRequest) throws Exception {
        try {
            User user = userRepository.findById(id).orElseThrow(() -> new Exception("User not found with id " + id));
            user.setEmail(userRequest.getEmail());
            user.setFirstName(userRequest.getFirstName());
            user.setLastName(userRequest.getLastName());
            user.setPassword(userRequest.getPassword());
            user.setUserCode(userRequest.getUserCode());
            user.setUserType(userRequest.getUserType());
            return userRepository.save(user);
        } catch (Exception e) {
            throw new Exception("Error updating user with id " + id + ": " + e.getMessage(), e);
        }
    }

}
