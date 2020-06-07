package com.seasky.spring_boot_mybatis.service;

import com.seasky.spring_boot_mybatis.dao.UserMappper;
import com.seasky.spring_boot_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMappper userMappper;

    @Autowired
    StuService stuService;

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void save(){
        User user = new User();
        user.setUserName("111111");
        userMappper.save(user);

//        userMappper.updateUserName("cc");
//        userMappper.updateUserNameById(2l);



//        try {
            User us = new User();
            us.setUserName("student");
            stuService.save(us);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        User stu = userMappper.getByUserName("student");

        List<User> users = userMappper.selectUsersLikeName("stu");
        users.forEach(System.out::println);
        System.out.println(stu);
//        int i = 1/0;
        System.out.println("=========  end");

    }


}
