package com.example.bigproject.entity;

import com.example.bigproject.entity.template.AbsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data

@Entity
public class Currency extends AbsEntity {


}
