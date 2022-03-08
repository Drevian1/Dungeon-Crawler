package edu.Neumont.oop.Model;

public class Human extends Race {
    public Human() {
        setSpeed(30);
    }

    @Override
    public void setSpeed(int speed) {
        speed = 30;
        super.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "Human{" +
                "speed=" + speed +
                '}';
    }
}
