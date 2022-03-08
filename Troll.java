package edu.Neumont.oop.Model;

public class Troll extends Monster{
    public Troll() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    @Override
    void setChallengeRating() {
        challengeRating = 5;
    }

    public void regenerate(){
        if (health >= 5){
            health = health + 10;
        }
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(8,10) + 40);
    }

    @Override
    void setArmorClass() {
        armorClass = 15;
    }

    @Override
    public int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 7);
        if (hitChance >= armorClass){
            damage = (dice.rollMultiple(2,6) + 4);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        regenerate();
        return damage;
    }
}
