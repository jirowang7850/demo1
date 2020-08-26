package com.qf.controller;

import com.qf.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0 2020/8/12 0012 上午 11:40
 */

@Api(description = "用户接口")
//@Api(tags = "用户接口")
@RestController("user")
public class UserControlle {


    @ApiOperation("查询所有用户")
    @GetMapping("findAll")
    public List<User> findAll() {
        User user1 = new User();
        user1.setUid("1001");
        user1.setUsername("张三");
        user1.setPassword("123");

        User user2 = new User();
        user2.setUid("1002");
        user2.setUsername("李四");
        user2.setPassword("456");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        return  users;

    }

    @ApiOperation("根据id查询")
    @RequestMapping("findById")
    public User findById(@RequestParam @ApiParam("用户id") String uid) {

        User user = new User();
        user.setUid(uid);
        user.setUsername("张三");
        user.setPassword("123");

        return  user;
    }

    @ApiOperation("删除单个用户")
    @PostMapping("delete")
    public User delete(String uid){

        User user = new User();
        user.setUid(uid);
        user.setUsername("李四");
        user.setPassword("456");

        return  user;
    }
}
