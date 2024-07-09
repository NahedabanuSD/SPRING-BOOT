package com.example.naheda.Assignment1.BakeryAssignment1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="flavor", havingValue = "Strawberry")
public class StrawberrySyrup implements SyrupInt{


    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
