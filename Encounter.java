package edu.Neumont.oop.Model;

import java.util.Locale;
import java.util.Random;

public class Encounter {
    Character player = new Character();
    MonsterFactory generator = new MonsterFactory();
    Dice dice = new Dice();




    public void easyEncounter(String string) {
        Monster monster = generator.gen_Monster();
        while (monster.getChallengeRating() > player.getLevel()) {
            monster = generator.gen_Monster();
        }
        System.out.println("HP: " + player.getHealth());
        System.out.println("Monster HP: " + monster.getHealth());
        int monsterHP = monster.getHealth();
        boolean fightLoop= true;

        while (fightLoop != false){
            System.out.println("Select action:" + '\n' + "A: Attack" + '\n' + "B: Ready" + '\n' + "C: Retreat");
            String action = string.toLowerCase(Locale.ROOT);
            if (action.equals("a")){

               monsterHP = monsterHP - player.getpClass().attack(monster.getArmorClass(), player.setStrMod());

                System.out.println("Monster HP: " + monsterHP);

                player.setHealth(player.getHealth() - monster.attack(player.getpClass().getArmor()));

                System.out.println("HP: " + player.getHealth());

                }else if(action.equals("b")){

                System.out.println("You watch the monster and learn its movements");

                player.setHealth(player.getHealth() + 5);

                 monster.attack(player.getpClass().getArmor() + 5);

                System.out.println("HP: " + player.getHealth());

            }else if(action.equals("c")){
                monster.attack(player.getpClass().getArmor() + 5);

                System.out.println("HP: " + player.getHealth());
                fightLoop = false;
            }


        }

    }
    public void hardEncounter(String string){
        Monster monster = generator.gen_Monster();
        System.out.println("HP: " + player.getHealth());
        System.out.println("Monster HP: " + monster.getHealth());
        int monsterHP = monster.getHealth();
        boolean fightLoop= true;
        while (fightLoop != false){
            System.out.println("Select action:" + '\n' + "A: Attack" + '\n' + "B: Ready" + '\n' + "C: Retreat");
            String action = string.toLowerCase(Locale.ROOT);
            if (action.equals("a")){

                monsterHP = monsterHP - player.getpClass().attack(monster.getArmorClass(), player.setStrMod());

                System.out.println("Monster HP: " + monsterHP);

                player.setHealth(player.getHealth() - monster.attack(player.getpClass().getArmor()));

                System.out.println("HP: " + player.getHealth());

            }else if(action.equals("b")){

                System.out.println("You watch the monster and learn its movements");

                player.setHealth(player.getHealth() + 5);

                monster.attack(player.getpClass().getArmor() + 5);

                System.out.println("HP: " + player.getHealth());

            }else if(action.equals("c")){
                monster.attack(player.getpClass().getArmor() + 5);

                System.out.println("HP: " + player.getHealth());
                fightLoop = false;
            }

            if (monsterHP <= 0){
                System.out.println("You defeated the monster");
                fightLoop = false;
            }else if (player.getHealth() <=0){
                System.out.println("You were defeated");
                fightLoop = false;
            }
        }

    }

    public void bossEncounter(String string){
        Monster boss = generator.generate_Boss();
        System.out.println("HP: " + player.getHealth());
        System.out.println("Monster HP: " + boss.getHealth());
        int monsterHP = boss.getHealth();
        boolean fightLoop= true;
        while (fightLoop != false){
            System.out.println("Select action:" + '\n' + "A: Attack" + '\n' + "B: Ready" + '\n' + "C: Retreat");
            String action = string.toLowerCase(Locale.ROOT);
            if (action.equals("a")){

                monsterHP = monsterHP - player.getpClass().attack(boss.getArmorClass(), player.setStrMod());

                System.out.println("Monster HP: " + monsterHP);

                player.setHealth(player.getHealth() - boss.attack(player.getpClass().getArmor()));

                System.out.println("HP: " + player.getHealth());

            }else if(action.equals("b")){

                System.out.println("You watch the monster and learn its movements");

                player.setHealth(player.getHealth() + 5);

                boss.attack(player.getpClass().getArmor() + 5);

                System.out.println("HP: " + player.getHealth());

            }else if(action.equals("c")){
                boss.attack(player.getpClass().getArmor() + 5);

                System.out.println("HP: " + player.getHealth());
                fightLoop = false;
            }

            if (monsterHP <= 0){
                System.out.println("You defeated the monster");
                fightLoop = false;
            }else if (player.getHealth() <=0){
                System.out.println("You were defeated");
                fightLoop = false;
            }
        }
    }


}
