package com.pcy.service;

import com.pcy.dao.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
@Transactional(propagation = Propagation.REQUIRED,timeout = 300,rollbackFor = {RuntimeException.class, Exception.class})
public interface UserService {
    void save(User user);
    List<User> getUsers();
}
