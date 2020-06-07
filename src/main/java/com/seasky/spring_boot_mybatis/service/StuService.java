package com.seasky.spring_boot_mybatis.service;

import com.seasky.spring_boot_mybatis.dao.UserMappper;
import com.seasky.spring_boot_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuService {
    @Autowired
    UserMappper userMappper;

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public User save(User user){
        userMappper.save(user);
//int i = 1/0;
        return user;
    }


}
