package edu.Neumont.oop.Model;

public class Elf extends Race{
    public Elf() {
        setSpeed(30);
    }

    @Override
    public void setSpeed(int speed) {
        speed = 30;
        super.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "Elf{" +
                "speed=" + speed +
                '}';
    }
}
