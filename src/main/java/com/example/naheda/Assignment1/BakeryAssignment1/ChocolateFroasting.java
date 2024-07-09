package com.example.naheda.Assignment1.BakeryAssignment1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="flavor", havingValue = "Chocolate")
public class ChocolateFroasting implements  FroastingInt{

    @Override
    public String getFroastingType() {
        return "Chocolate Froasting";
    }
}
