package edu.Neumont.oop.Model;

public class Doppelganger extends Monster{
    public Doppelganger() {
        setArmorClass();
        setHealth();
        setChallengeRating();
    }

    Character character = new Character();
    @Override
    void setChallengeRating() {
        challengeRating = character.getLevel();
    }

    @Override
    void setHealth() {
        health = (character.getHealth() + 20);
    }

    @Override
    void setArmorClass() {
        armorClass = 15;
    }

    @Override
    public int attack(int AC) {
            int damage = 0;
            int attacks = 0;
            while (attacks < 2) {
                int hitChance = (dice.RollOnce(20) + 6) ;
                if (hitChance >= AC) {
                    damage = (dice.RollOnce(8)  + 4);
                    attacks++;
                } else {
                    damage = 0;
                    System.out.println("Attack missed");
                    attacks++;
                }
            }
            return damage;


        }

    }
