package com.example.springbootmybatisdemo.service;

import com.example.springbootmybatisdemo.domain.UserDomain;

import java.util.List;

public interface UserService {

    int insert(UserDomain record);

    void deleteUserById(Integer userId);

    void updateUser(UserDomain userDomain);

    List<UserDomain> selectUsers();

    List<UserDomain> selectUsersByPage(int startIndex, int pageSize);
}
