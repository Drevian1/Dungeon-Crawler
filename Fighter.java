package edu.Neumont.oop.Model;

public class Fighter extends PClass{


    @Override
    int setArmor(int mod) {
        armor = 16;
        return armor;
    }

    @Override
    int getSpellPoints() {
        return 0;
    }

    @Override
    int attack(int AC, int mod) {
        int damage = 0;
        int attacks = 0;
        while (attacks < 2) {
            int hitChance = (dice.RollOnce(20) + mod);
            if (hitChance >= AC) {
                damage = (dice.RollOnce(8) + mod);
                attacks++;
            } else {
                damage = 0;
                System.out.println("Attack missed");
                attacks++;
            }
        }
        return damage;


    }

    @Override
    public String toString() {
        return "Fighter{" +
                "armor=" + armor +
                '}';
    }
}
