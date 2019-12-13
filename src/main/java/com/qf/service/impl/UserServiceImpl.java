package com.qf.service.impl;

import com.qf.domain.User;
import com.qf.repository.UserRepository;
import com.qf.response.UserResponse;
import com.qf.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserResponse findAll(Integer size, Integer page) {
        //页面<0时默认从0开始，后面的页数等于当前页-1
        if (page<0){
            page=0;
        }else {
            page =page-1;
        }
        PageRequest pages = PageRequest.of(page, size);
        Page<User> all = userRepository.findAll(pages);
        List<User> content = all.getContent();
        UserResponse userResponse = new UserResponse();
        userResponse.setList(content);
        userResponse.setTotal(all.getTotalElements());
        userResponse.setPage(all.getTotalPages());
        return userResponse;
    }

    @Override
    public User findById(Integer id) {
        Optional<User> byId = userRepository.findById(id);
        User user=null;
        if (byId.isPresent()){
            user=byId.get();
        }
        return user;
    }

    @Override
    public User saveAndFlush(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public String deleteById(User user) {
        try {
            userRepository.deleteById(user.getId());
            return "success";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "fail";
    }

}
