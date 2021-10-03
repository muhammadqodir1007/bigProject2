package com.example.bigproject.entity;

import com.example.bigproject.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true,nullable = false)
    private String phoneNumber;
    private String code;
    private String password;
    private boolean active=true;
    @ManyToMany
    private List<WareHouse> wareHouse;



}
