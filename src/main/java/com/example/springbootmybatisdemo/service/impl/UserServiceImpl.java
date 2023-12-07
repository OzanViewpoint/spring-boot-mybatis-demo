package com.example.springbootmybatisdemo.service.impl;

import com.example.springbootmybatisdemo.dao.UserDao;
import com.example.springbootmybatisdemo.domain.UserDomain;
import com.example.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insert(UserDomain record) {
        return userDao.insert(record);
    }

    @Override
    public void deleteUserById(Integer userId) {
        userDao.deleteUserById(userId);
    }

    @Override
    public void updateUser(UserDomain userDomain) {
        userDao.updateUser(userDomain);
    }

    @Override
    public List<UserDomain> selectUsers() {
        return userDao.selectUsers();
    }

    @Override
    public List<UserDomain> selectUsersByPage(int startIndex, int pageSize) {
        return userDao.selectUsersByPage(startIndex, pageSize);
    }
}
