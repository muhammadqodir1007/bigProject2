package com.example.bigproject.Controller;

import com.example.bigproject.entity.Measurment;
import com.example.bigproject.payload.Result;
import com.example.bigproject.repositories.MeasurementsRepository;
import com.example.bigproject.servise.MeasurmentServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measurment")
public class MeasurmentController {

    @Autowired
    MeasurmentServise measurmentServise;
    @Autowired
    MeasurementsRepository measurementsRepository;

    @PostMapping
    public Result addMeasurment(@RequestBody Measurment measurment){
        Result result = measurmentServise.addMeasurments(measurment);
        return result;


    }@GetMapping
    public List<Measurment>getMeasurments(){
      return   measurementsRepository.findAll();

    }



}
