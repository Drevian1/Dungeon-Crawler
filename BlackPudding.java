package edu.Neumont.oop.Model;

public class BlackPudding extends Monster{
    @Override
    void setChallengeRating() {
        challengeRating = 4;
    }


    @Override
    void setHealth() {
        health = (dice.rollMultiple(10,10)+30);
    }

    @Override
    void setArmorClass() {
        armorClass = 7;
    }



    public int corrode(int save){
        int damage;
        if (save < 12) {
            damage = (dice.RollOnce(8));
        }else {
            damage = 0;
         }
        return damage;
    }

    @Override
    int attack(int armorClass) {
        int damage;
        int hitChance = (dice.RollOnce(20) + 5);
        if (hitChance >= armorClass){
            damage = ((dice.RollOnce(6) + 3) + dice.rollMultiple(4,8));
        }else{
            damage = 0;
            System.out.println("Attack missed");
        }
        return damage;
    }
}
