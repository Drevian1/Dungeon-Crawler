package edu.Neumont.oop.Model;

public class Paladin extends PClass{
    @Override
    int setArmor(int mod) {
        armor = 18;
        return armor;
    }

    @Override
    String setName() {
        name = "Paladin";
        return name;
    }

    @Override
    int getSpellPoints() {
        spellPoints = 20;
        return spellPoints;
    }

    @Override
    String goString() {
        return null;
    }

    public void reduceSpellPoints(int change){
        spellPoints = getSpellPoints() - change;
    }
    public int heal(int points){
        reduceSpellPoints(points);
        return points;
    }

    @Override
    public int attack(int AC, int mod) {
        int damage = 0;

        int hitChance = (dice.RollOnce(20) + mod);

        if (hitChance >= AC) {
            damage = (dice.RollOnce(10) + (mod));

        } else {
            damage = 0;
            System.out.println("Attack missed");

        }

        return damage;


    }

    @Override
    public String toString() {
        return "Paladin{" +
                "Armor=" + armor +
                ", spellPoints=" + spellPoints +
                '}';
    }
}
