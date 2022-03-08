package edu.Neumont.oop.Model;

public class Minotaur extends Monster{
    public Minotaur() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 3;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(9,10) + 27);
    }

    @Override
    void setArmorClass() {
        armorClass = 14;
    }

    public int gore(){
        int damage = dice.rollMultiple(2,8);
        return gore();
    }
    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 6);
        if (hitChance >= armorClass){
            damage = (dice.rollMultiple(2,12) + 4);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
