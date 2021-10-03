package com.example.bigproject.entity;

import com.example.bigproject.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client extends AbsEntity {

    @Column(nullable = false,unique = true)
    private String phoneNumber;



}
