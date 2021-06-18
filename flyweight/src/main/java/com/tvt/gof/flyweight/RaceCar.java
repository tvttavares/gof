package com.tvt.gof.flyweight;

public abstract class RaceCar {

    /*Intrinsic state  stored and shared in the Flyweight object*/
    public String name;
    public int speed;
    public int horsePower;

    /* Extrinsic state is stored or computed by client objects, and passed to the Flyweight.*/
    abstract void moveCar(int currentX, int currentY, int newX, int newY);
}