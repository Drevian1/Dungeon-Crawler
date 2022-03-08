package edu.Neumont.oop.Model;

public class Dwarf extends Race{
    public Dwarf() {
        setSpeed(25);
    }

    @Override
    public void setSpeed(int speed) {
        speed = 25;
        super.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "speed=" + speed +
                '}';
    }
}
