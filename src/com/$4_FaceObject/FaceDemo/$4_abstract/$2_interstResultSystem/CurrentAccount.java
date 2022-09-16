package com.$4_FaceObject.FaceDemo.$4_abstract.$2_interstResultSystem;

public class CurrentAccount extends Account{
    /*
        活期账户
     */
    
    @Override
    public double calc() {
        double reasult;
        reasult = this.getMoney() * 0.35 / 100;
        return reasult;
    }
}
