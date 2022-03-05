package edu.Neumont.oop.Model;

public class Human extends Race {
    @Override
    public void setSpeed(int speed) {
        speed = 30;
        super.setSpeed(speed);
    }


}
