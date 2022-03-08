package edu.Neumont.oop.Model;

public class Rogue extends PClass{
    public Rogue() {
        setArmor(5);
        setName();
    }

    @Override
    int setArmor(int mod) {
        armor = 11 + mod;
        return armor;
    }

    @Override
    String setName() {
        name = "Rogue";
        return name;
    }

    @Override
    int getSpellPoints() {
        return 0;
    }


    @Override
    public int attack(int AC, int mod) {
        int damage = 0;

        int hitChance = (dice.RollOnce(20) + (5 + mod));

        if (hitChance >= AC) {
            damage = (dice.RollOnce(4) + (mod + 5) + (dice.rollMultiple(4,6)));

        } else {
            damage = 0;
            System.out.println("Attack missed");

        }

        return damage;


    }




    @Override
     String goString() {
        return "Rogue{" +
                "armor=" + armor +
                '}';
    }
}
