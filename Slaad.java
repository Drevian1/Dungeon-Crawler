package edu.Neumont.oop.Model;

public class Slaad extends Monster{
    public Slaad() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 5;
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(11,10) + 33);
    }
    public void regenerate(){
        if (health >= 5){
            health = health + 10;
        }
    }
    @Override
    void setArmorClass() {
        armorClass = 14;
    }
//attacks three times
    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 6);
        if (hitChance >= armorClass){
            damage = (dice.RollOnce(8) + 3);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        regenerate();
        return damage;
    }
}
