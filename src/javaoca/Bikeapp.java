
package javaoca;

import javaoca.Bike;

public class Bikeapp {
    public static void main(String[] args) {

        Bike bike1=new javaoca.Bike();
        bike1.setModel("giant");
        bike1.setColor("green");
        bike1.setMaxSpeed(30);
        bike1.setBrakeType("discBrake");
        bike1.setBikeyear(2012);
        bike1.setChainSize(4);
        bike1.setPriceofBike(120);
        bike1.setTireSize(290);

        javaoca.Bike bike2=new javaoca.Bike();
        bike2.setModel("Trek");
        bike2.setColor("blue");
        bike2.setMaxSpeed(50);
        bike2.setBrakeType("rim");
        bike2.setBikeyear(2018);
        bike2.setChainSize(6);
        bike2.setPriceofBike(200);
        bike2.setTireSize(220);

        bike1.bikedetail();       // non-static
        System.out.println();
        bike2.bikedetail(bike2);  // static

    }
}
