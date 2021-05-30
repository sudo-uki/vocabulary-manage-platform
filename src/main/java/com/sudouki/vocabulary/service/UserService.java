package com.sudouki.vocabulary.service;

import com.sudouki.vocabulary.domain.User;
import com.sudouki.vocabulary.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service("UserService")
public class UserService {

    @Resource
    private UserMapper mapper;

    public void insert() {
        mapper.insert(new User(UUID.randomUUID().toString().trim()));
    }


}
