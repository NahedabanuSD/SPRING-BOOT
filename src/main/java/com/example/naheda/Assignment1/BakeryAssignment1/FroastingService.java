package com.example.naheda.Assignment1.BakeryAssignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FroastingService {
    @Autowired
    private FroastingInt froasting;

   String getFroastingType(){
       return froasting.getFroastingType();
   }

}
