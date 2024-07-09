package com.example.naheda.Assignment1.BakeryAssignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    SyrupInt syrup;
    @Autowired
    FroastingInt froasting;
    //constructor injection
    public CakeBaker(FroastingInt froasting, SyrupInt syrup) {
        super();
        this.froasting = froasting;
        this.syrup = syrup;
    }


    public void bakeCake() {
        System.out.println("baked a cake with "+froasting.getFroastingType()+" and syrup is "+syrup.getSyrupType());
    }
}
