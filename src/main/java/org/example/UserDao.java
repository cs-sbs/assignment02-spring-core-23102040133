package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public boolean checkUser(String username, String password) {
        // 简单模拟数据库检查
        return "admin".equals(username) && "123456".equals(password);
    }
}