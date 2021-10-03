package com.example.bigproject.Controller;

import com.example.bigproject.payload.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @PostMapping
    public Result addCategory(){
        return new Result();
        
    }
}
