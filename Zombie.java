package edu.Neumont.oop.Model;

public class Zombie extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = (1/4);
    }

    @Override
    void setHealth() {
        health = (dice.rollMultiple(3,8) + 9);
    }

    @Override
    void setArmorClass() {
        armorClass = 8;
    }
    public void undeadFortitude(){
        if (getHealth() <=0 && getHealth() > -(getHealth()/2)){
            health = 1;
        }
    }
    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 3);
        if (hitChance >= armorClass){
            damage = (dice.RollOnce(6) + 1);
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
