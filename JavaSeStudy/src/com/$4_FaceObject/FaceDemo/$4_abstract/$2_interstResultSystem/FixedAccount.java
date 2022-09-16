package com.$4_FaceObject.FaceDemo.$4_abstract.$2_interstResultSystem;

public class FixedAccount extends Account {
    @Override
    public double calc() {
        double reasult;
        if (this.getMoney() >= 100000) {
            reasult = (this.getMoney() * 1.75  / 100) + (this.getMoney() * 3 /100);
        } else {
            reasult = this.getMoney() * 1.75 / 100;
        }
        return reasult;
    }
}
