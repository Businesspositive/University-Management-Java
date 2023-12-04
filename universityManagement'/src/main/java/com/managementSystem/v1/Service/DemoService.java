package com.managementSystem.v1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepo demoRepo;

    public Demo saveDetails(Demo demo){

        return demoRepo.save(demo);

    }
}
