package com.example.bigproject.servise;

import com.example.bigproject.entity.Measurment;
import com.example.bigproject.payload.Result;
import com.example.bigproject.repositories.MeasurementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MeasurmentServise {
@Autowired
    MeasurementsRepository measurementsRepository;
    public Result addMeasurments(@RequestBody Measurment measurment){
        Measurment  measurment1=new Measurment();
        measurment1.setName(measurment.getName());
        measurment1.setActive(measurment.isActive());
        measurementsRepository.save(measurment1);
        return new Result("sucsess",true);

    }
}
