package edu.Neumont.oop.Model;

public class Fighter extends PClass{
    public Fighter() {
        setArmor(0);
        setName();
    }

    @Override
    int setArmor(int mod) {
        armor = 16;
        return armor;
    }

    @Override
    String setName() {
        name = "Fighter";
        return name;
    }

    @Override
    int getSpellPoints() {
        return 0;
    }

    @Override
    public int attack(int AC, int mod) {
        int damage = 0;
        int attacks = 0;
        while (attacks < 2) {
            int hitChance = (dice.RollOnce(20) + (mod + 5));
            if (hitChance >= AC) {
                damage = (dice.RollOnce(8) + (mod + 5));
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
   String goString() {
        return "Fighter{" +
                "armor=" + armor +
                '}';
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "armor=" + armor +
                '}';
    }
}
