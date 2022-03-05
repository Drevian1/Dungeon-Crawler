package edu.Neumont.oop.Model;

public class Rogue extends PClass{
    @Override
    int setArmor(int mod) {
        armor = 11 + mod;
        return armor;
    }

    @Override
    int getSpellPoints() {
        return 0;
    }


    @Override
    int attack(int AC, int mod) {
        int damage = 0;

        int hitChance = (dice.RollOnce(20) + mod);

        if (hitChance >= AC) {
            damage = (dice.RollOnce(4) + (mod) + (dice.rollMultiple(4,6)));

        } else {
            damage = 0;
            System.out.println("Attack missed");

        }

        return damage;


    }

    @Override
    public String toString() {
        return "Rogue{" +
                "armor=" + armor +
                '}';
    }
}
