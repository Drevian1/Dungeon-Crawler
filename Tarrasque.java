package edu.Neumont.oop.Model;

public class Tarrasque extends Monster{
    public Tarrasque() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 30;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(33,20) + 330);
    }

    @Override
    void setArmorClass() {
        armorClass = 25;
    }

    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 19);
        if (hitChance >= armorClass){
            damage = ((dice.rollMultiple(4,12) + 10));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }

        hitChance = (dice.RollOnce(20) + 19);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(4,8) + 10));
        }else{
            damage += 0;
            System.out.println("Attack missed");
        }

        hitChance = (dice.RollOnce(20) + 19);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(4,8) + 10));
        }else{
            damage += 0;
            System.out.println("Attack missed");
        }

        hitChance = (dice.RollOnce(20) + 19);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(4,10) + 10));
        }else{
            damage += 0;
            System.out.println("Attack missed");
        }

        hitChance = (dice.RollOnce(20) + 19);
        if (hitChance >= armorClass){
            damage += ((dice.rollMultiple(4,6) + 10));
        }else{
            damage += 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
