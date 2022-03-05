package edu.Neumont.oop.Model;

public abstract class PClass {

    Dice dice = new Dice();
    protected int armor;

    public int getArmor() {
        return armor;
    }

    abstract int setArmor(int mod);


    protected int spellPoints;



    abstract int getSpellPoints();




    abstract int attack(int AC, int modifier);


}
