package com.$22_DesignMode.Demo;

public class FactoryMode {
    public static void main(String[] args) {
        Computer c1 = FactoryPattern.createComputer("华为");
        c1.start();

        Computer c2 = FactoryPattern.createComputer("苹果");
        c2.start();
    }
}
