package com.qf.controller;

import com.qf.domain.User;
import com.qf.response.UserResponse;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //查询所有
    @RequestMapping("/findAll/{size}/{page}")
    public UserResponse findAll(@PathVariable("size") Integer size, @PathVariable("page") Integer page){
        System.out.println("8002访问。。。");
        return userService.findAll(size,page);
    }
    //查询一个
    @RequestMapping("/findOne")
    public User findOne(@RequestBody User user){
        Integer id = user.getId();
        return  userService.findById(id);
    }
    //修改
    @RequestMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return  userService.saveAndFlush(user);
    }
    //删除
    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public String deleteById(@RequestBody User user){
        return  userService.deleteById(user);
    }
}
