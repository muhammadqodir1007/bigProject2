package com.example.bigproject.entity;

import com.example.bigproject.entity.template.AbsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)


public class Product extends AbsEntity {

    private Integer code;


    @ManyToOne
    private Category category;
    @OneToOne
    private Attachment photo;
    @ManyToOne
    private Measurment measurment;
}
