package com.example.javasecurity.service;

import com.example.javasecurity.model.Role;
import com.example.javasecurity.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User>findAllUsers();
}
