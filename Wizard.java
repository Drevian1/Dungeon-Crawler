package edu.Neumont.oop.Model;

public class Wizard extends PClass{

    @Override
    int setArmor(int mod) {
        armor = 10 + mod;
        return armor;
    }

    @Override
    String setName() {
        name = "Wizard";
        return name;
    }

    @Override
    int getSpellPoints() {
        spellPoints = 30;
        return spellPoints;
    }

    public void reduceSpellPoints(int change){
        spellPoints = getSpellPoints() - change;
    }
    public int fireBall(){
        int damage = 0;
        int save = dice.RollOnce(20) + 2;
        if (save < 16){
            damage = (dice.rollMultiple(6,6));
        }else{
            damage = (dice.rollMultiple(6,6)/2);
        }
        reduceSpellPoints(10);
        return damage;
    }

    public int fireBolt(){
        int damage = (dice.RollOnce(10));
        return damage;
    }

    public int rayOfFrost(){
        int damage = 0;
        int save = dice.RollOnce(20);
        if (save < 15){
            damage = (dice.rollMultiple(3,6));
        }else{
            damage = (dice.rollMultiple(3,6)/2);
        }
        reduceSpellPoints(5);
        return damage;
    }

    public void shield(){
        int tempAC = getArmor() + 5;
        if (armor != tempAC) {
            armor = tempAC;
            reduceSpellPoints(3);
        }
    }


    @Override
    public int attack(int AC, int mod) {
        int damage = 0;

        int hitChance = (dice.RollOnce(20) + mod);

        if (hitChance >= AC) {
            damage = (dice.RollOnce(6) + (mod));

        } else {
            damage = 0;
            System.out.println("Attack missed");

        }

        return damage;


    }

     @Override
    String goString() {
        return "Wizard{" +
                "armor=" + armor +
                ", spellPoints=" + spellPoints +
                '}';
    }
}
