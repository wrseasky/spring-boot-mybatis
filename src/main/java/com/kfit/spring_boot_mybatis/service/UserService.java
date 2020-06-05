package com.kfit.spring_boot_mybatis.service;

import com.kfit.spring_boot_mybatis.UserMappper;
import com.kfit.spring_boot_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserMappper userMappper;

    @Autowired
    StuService stuService;

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public User save(){
        User user = new User();
        user.setUserName("1111111");
        userMappper.save(user);

        User us = new User();
        us.setUserName("student");
        stuService.save(us);

        User stu = userMappper.getByUserName("student");
        System.out.println(stu);
//        int i = 1/0;

        return user;
    }


}
