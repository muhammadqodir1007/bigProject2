package com.example.bigproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Timestamp date;


    @ManyToOne
    private WareHouse wareHouse;

@ManyToOne
    private Client client;

    @ManyToOne
    private Currency currency;
    private String factureNumber;


}
