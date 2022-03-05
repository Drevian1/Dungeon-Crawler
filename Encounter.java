package edu.Neumont.oop.Model;

import java.util.Random;

public class Encounter {
    Character player = new Character();
    MonsterFactory generator = new MonsterFactory();
    Dice dice = new Dice();



    public void easyEncounter() {
        Monster monster = generator.gen_Monster();
        while (monster.getChallengeRating() > player.getLevel()) {
            monster = generator.gen_Monster();
        }


    }



}
