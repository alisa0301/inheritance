package com.company;

final public class Worm extends Animal{

    public void regenerate() {
        System.out.println("Червячок живой!!");
    }

    //Переопределение
    @Override
    public void sleep() {
        System.out.println("Червячок " + super.getName() + " спит");
    }
}
