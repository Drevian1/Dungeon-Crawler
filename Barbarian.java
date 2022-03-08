package edu.Neumont.oop.Model;

public class Barbarian extends PClass{

    public Barbarian() {
        setArmor(4);
        setName();
    }

    @Override
    int setArmor(int mod) {
        armor = 13 + mod;
        return armor;
    }

    @Override
    String setName() {
        name = "Barbarian";
        return name;
    }

    @Override
    int getSpellPoints() {
        return 0;
    }

    @Override
    public int attack(int AC, int mod) {
        int damage = 0;

            int hitChance = (dice.RollOnce(20) + (mod + 5));
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
                "name='" + name + '\'' +
                ", armor=" + armor +
                '}';
    }

    @Override
    String goString() {
        return "Barbarian{" +
                "armor=" + armor +
                '}';
    }
}
