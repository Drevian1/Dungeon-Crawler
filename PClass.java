package edu.Neumont.oop.Model;

public abstract class PClass {
    protected String name;
    Dice dice = new Dice();
    protected int armor;

    public int getArmor() {
        return armor;
    }

    abstract int setArmor(int mod);

    public String getName() {
        return name;
    }

    protected int spellPoints;

    abstract String setName();

    abstract int getSpellPoints();

    abstract String goString();


    public abstract int attack(int AC, int modifier);


}
