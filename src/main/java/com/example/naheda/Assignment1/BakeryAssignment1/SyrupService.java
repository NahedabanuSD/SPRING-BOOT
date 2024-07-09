package com.example.naheda.Assignment1.BakeryAssignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyrupService {
    @Autowired
    private SyrupInt syrup;

    String getSyrupType(){
        return syrup.getSyrupType();
    }
}
