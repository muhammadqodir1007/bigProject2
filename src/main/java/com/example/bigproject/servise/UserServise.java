package com.example.bigproject.servise;

import com.example.bigproject.entity.User;
import com.example.bigproject.payload.Result;
import com.example.bigproject.payload.UserDto;
import com.example.bigproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServise {
    @Autowired
    UserRepository userRepository;

    public Result addUser(@RequestBody UserDto userDto) {

        User user = new User();
        user.setActive(userDto.isActive());
        user.setCode(userDto.getCode());
        user.setFirstName(user.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(user.getPassword());
        userRepository.save(user);
        return new Result("success", true);

    }
}