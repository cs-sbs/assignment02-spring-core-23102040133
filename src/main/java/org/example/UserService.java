package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean login(String username, String password) {
        return userDao.checkUser(username, password);
    }
}