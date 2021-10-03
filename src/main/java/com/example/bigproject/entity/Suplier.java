package com.example.bigproject.entity;

import com.example.bigproject.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Suplier extends AbsEntity {
@Column(updatable = true,nullable = false)
    private String phoneNumber;


}
