package edu.Neumont.oop.Model;

public class Barbarian extends PClass{


    @Override
    int setArmor(int mod) {
        armor = 13 + mod;
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
                damage = (dice.RollOnce(12) + (mod + 10));

            } else {
                damage = 0;
                System.out.println("Attack missed");

            }

        return damage;


    }

    @Override
    public String toString() {
        return "Barbarian{" +
                "armor=" + armor +
                '}';
    }
}
