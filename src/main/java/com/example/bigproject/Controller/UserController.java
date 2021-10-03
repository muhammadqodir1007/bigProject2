package com.example.bigproject.Controller;

import com.example.bigproject.payload.Result;
import com.example.bigproject.payload.UserDto;
import com.example.bigproject.servise.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    UserServise userServise;
@PostMapping
    public Result addUser(@RequestBody UserDto userDto){
    Result result = userServise.addUser(userDto);
    return result;


}
}
