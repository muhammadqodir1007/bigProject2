package com.example.bigproject.repositories;

import com.example.bigproject.entity.Measurment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementsRepository extends JpaRepository<Measurment,Integer> {



}
