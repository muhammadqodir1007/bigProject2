package com.example.bigproject.payload;

import com.example.bigproject.entity.WareHouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String code;
    private String password;
    private boolean active;
    private WareHouse  wareHouses;


}
