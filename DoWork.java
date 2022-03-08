package edu.Neumont.oop.Controller;

import edu.Neumont.oop.Model.*;
import edu.Neumont.oop.Model.Character;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Locale;
import java.util.Random;

public class DoWork {

    private BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
    int[] PlayerStats = new int[6];
    int[] Stats = new int[6];
    Character player = new Character();
    Race race;
    String define = "";
    PClass pClass;


//Runs through  game
    public void dungeon(){
        MonsterFactory generator = new MonsterFactory();
        System.out.println("Select game mode: " + '\n' + " A: Complete the disk");
        String gameMode = GetString().toLowerCase(Locale.ROOT);

        if (gameMode.equals("a")) {
            int diskPieces = 0;
            boolean adventure = true;
            while (adventure != false) {
                Random rnd = new Random();

                int generate;
                if (diskPieces <8){
                    generate = 0;
                }else{
                    generate = 1;
                }
                Monster monster;
                switch (generate) {
                    case 0:
                       monster = generator.gen_Monster();
                        System.out.println("HP: " + player.getHealth());
                        int monsterHP = monster.getHealth();
                        System.out.println("Monster HP: " + monsterHP);

                        boolean fightLoop = true;

                        while (fightLoop != false) {
                            System.out.println("Select action:" + '\n' + "A: Attack" + '\n' + "B: Ready" + '\n' + "C: Retreat");
                            String action = GetString().toLowerCase(Locale.ROOT);
                            if (action.equals("a")) {

                                monsterHP = monsterHP - (player.getpClass().attack(monster.getArmorClass(), player.setStrMod()));

                                if (monsterHP <= 0) {
                                    System.out.println("You WIN");
                                    int getEasyDisk = rnd.nextInt(100);
                                    if (getEasyDisk <= 80) {
                                        System.out.println("You found a disk piece");
                                        diskPieces++;
                                    }
                                    fightLoop = false;
                                    break;
                                }

                                System.out.println("Monster HP: " + monsterHP);

                                player.setHealth(player.getHealth() - monster.attack(player.getpClass().getArmor()));
                                if (player.getHealth() <= 0) {
                                    System.out.println("You lose");
                                    fightLoop = false;
                                    break;
                                }

                                System.out.println("HP: " + player.getHealth());

                            } else if (action.equals("b")) {

                                System.out.println("You watch the monster and learn its movements");

                                player.setHealth(player.getHealth() + 5);

                                monster.attack(player.getpClass().getArmor() + 5);

                                System.out.println("HP: " + player.getHealth());

                            } else if (action.equals("c")) {
                                monster.attack(player.getpClass().getArmor() + 5);

                                System.out.println("HP: " + player.getHealth());
                                fightLoop = false;
                            }
                        }

                        break;

                    case 1:
                        monster = generator.generate_Boss();
                        System.out.println("HP: " + player.getHealth());
                        monsterHP = monster.getHealth();
                        System.out.println("Monster HP: " + monsterHP);

                        fightLoop = true;

                        while (fightLoop != false) {
                            System.out.println("Select action:" + '\n' + "A: Attack" + '\n' + "B: Ready" + '\n' + "C: Retreat");
                            String action = GetString().toLowerCase(Locale.ROOT);
                            if (action.equals("a")) {

                                monsterHP = monsterHP - (player.getpClass().attack(monster.getArmorClass(), player.setStrMod()));

                                if (monsterHP <= 0) {
                                    System.out.println("You WIN");
                                    player.setHealth(player.getHealth() + (player.getHealth()/2));
                                    int getEasyDisk = rnd.nextInt(100);
                                    if (getEasyDisk <= 80) {
                                        System.out.println("You found a disk piece");
                                        diskPieces++;
                                    }
                                    fightLoop = false;
                                    break;
                                }

                                System.out.println("Monster HP: " + monsterHP);

                                player.setHealth(player.getHealth() - monster.attack(player.getpClass().getArmor()));
                                if (player.getHealth() <= 0) {
                                    System.out.println("You lose");
                                    fightLoop = false;
                                    break;
                                }

                                System.out.println("HP: " + player.getHealth());

                            } else if (action.equals("b")) {

                                System.out.println("You watch the monster and learn its movements");

                                player.setHealth(player.getHealth() + 5);

                                monster.attack(player.getpClass().getArmor() + 5);

                                System.out.println("HP: " + player.getHealth());

                            } else if (action.equals("c")) {
                                monster.attack(player.getpClass().getArmor() + 5);

                                System.out.println("HP: " + player.getHealth());
                                fightLoop = false;
                            }
                        }

                        break;

                    default:
                        System.out.println("Error");
                        break;
                }
                if (diskPieces == 8) {
                    System.out.println("You have completed the disk, you WIN");
                    adventure = false;
                } else if (player.getHealth() <= 0) {
                    System.out.println("You lost");
                    adventure = false;
                }

            }
        }

    }
// calls both menus
    public void menu(){
        CharacterMenu();
        dungeon();
    }

    public void printCharacter(){
        System.out.println(player.toString());

    }

// creates custom character or
    public void CharacterMenu(){

        boolean createLoop = true;



            while (createLoop != false) {

                System.out.println("Would you like to make a new character? Y or N");
                String makeNew = GetString().toLowerCase(Locale.ROOT);
                if (makeNew.equals("y")) {
                    System.out.println("Select what race you would like your character to be:" + '\n' + "1: Human" + '\n' + "2: Elf" + '\n' + "3: Dwarf");
                    setRace(GetInt());
                    StatMenu();
                    System.out.println("Enter name for character");
                    setName(GetString());
                    setHealth();System.out.println("Select what class you would like your character to be:" + '\n' + "1: Fighter" + '\n' + "2: Barbarian" + '\n' + "3: Rogue");

                    setClass(GetInt());
                    printCharacter();
                    createLoop = false;
                } else if (makeNew.equals("n")) {
                    Random random = new Random();
                    int rnd = random.nextInt(1,3);
                    setRace(rnd);
                    rndStats();
                    setName("Jeffery");
                    setHealth();
                    setClass(rnd);
                    printCharacter();
                    createLoop = false;
                }
            }
        }


        private void rndStats(){
        getStats();
        player.setStr(Stats[0]);
            player.setStrMod();
        player.setDex(Stats[1]);
            player.setDexMod();
        player.setCon(Stats[2]);
            player.setConMod();
        player.setInt(Stats[3]);
            player.setIntMod();
        player.setWis(Stats[4]);
            player.setWisMod();
        player.setCha(Stats[5]);
            player.setChaMod();
        }



    public void setRace(int choice){
        boolean raceLoop = true;
        while (raceLoop != false){


            if (choice == 1){
                race = new Human();
                define = "Human";
                raceLoop = false;
            }else if(choice == 2){
                race = new Elf();
                define = "Elf";
                raceLoop = false;
            }else if(choice == 3){
                race = new Dwarf();
                define = "Dwarf";
                raceLoop = false;
            }else{
                System.out.println("Please enter valid option");
            }

        }
        player.setRace(race);
    }
    public void setHealth(){
        Dice dice = new Dice();

        player.setHealth(dice.rollMultiple(10,12) + (player.setConMod() * 2));
    }
    public void setClass(int decision){
        boolean classLoop = true;
        while (classLoop != false){


            if (decision == 1){
                pClass = new Fighter();
                classLoop = false;
            }else if(decision==2){
                pClass = new Barbarian();
                classLoop = false;
            }else if(decision==3){
                pClass = new Rogue();
                classLoop = false;

            }else{
                System.out.println("Please enter valid option");
            }

        }
        player.setpClass(pClass);
    }
    public void StatMenu(){

        boolean statLoop = true;


        while (statLoop != false) {

            getStats();
            printStats();
            setSTR();
            player.setStrMod();
            setDEX();
            player.setDexMod();
            setCON();
            player.setConMod();
            setWIS();
            player.setWisMod();
            setINT();
            player.setIntMod();
            setCHA();
            player.setChaMod();

            statLoop = false;

     }
   }

   public void setName(String name){



            if (name.isEmpty() || name.isBlank()){
                player.setName("Hero with no Name");

            }else {
                player.setName(name);


        }
   }



   public void getStats(){

       for (int i = 0; i < Stats.length; i++) {
           Stats[i] = player.generateStat();

       }
   }

   public void setSTR(){
        boolean strLoop = true;
       while (strLoop != false) {
           System.out.println("Select Strength score. (1-6)");
           int num = GetInt();
           if (num > 6 || num < 1){
               System.out.println("Please select valid option");
           }else if(Stats[num - 1] == 0) {
               System.out.println("Please select valid stat");
           }else{
               if (define.equals("Human")){
                   player.setStr(Stats[num -1] + 1);
               }else{
                   player.setStr(Stats[num - 1]);
               }
               PlayerStats[0] = player.getStr();
               Stats[num - 1] = 0;

               printStats();
               strLoop = false;
           }

       }
   }

   public void setDEX(){
       boolean dexLoop = true;
       while (dexLoop != false) {
           System.out.println("Select Dexterity score. (1-6)");
           int num = GetInt();
           if (num > 6 || num < 1){
               System.out.println("Please select valid option");
           }else if(Stats[num - 1] == 0) {
               System.out.println("Please select valid stat");
           }else{
               if (define.equals("Human")){
                   player.setDex(Stats[num - 1] + 1);
               }else if(define.equals("Elf")){
                   player.setDex(Stats[num - 1] + 2);
               }else{
                   player.setDex(Stats[num - 1]);
               }
               PlayerStats[1] = player.getDex();
               Stats[num - 1] = 0;
               printStats();
               dexLoop = false;
           }

       }
   }

    public void setCON(){
        boolean conLoop = true;
        while (conLoop != false) {
            System.out.println("Select Constitution score. (1-6)");
            int num = GetInt();
            if (num > 6 || num < 1){
                System.out.println("Please select valid option");
            }else if(Stats[num - 1] == 0) {
                System.out.println("Please select valid stat");
            }else{
                if (define.equals("Human")){
                    player.setCon(Stats[num - 1] + 1);
                }else if(define.equals("Dwarf")){
                    player.setCon(Stats[num - 1] + 2);
                }else {
                    player.setCon(Stats[num - 1]);
                }
                PlayerStats[2] = player.getCon();
                Stats[num - 1] = 0;
                printStats();
                conLoop = false;
            }

        }
    }
    public void setWIS(){
        boolean wisLoop = true;
        while (wisLoop != false) {
            System.out.println("Select Wisdom score. (1-6)");
            int num = GetInt();
            if (num > 6 || num < 1){
                System.out.println("Please select valid option");
            }else if(Stats[num - 1] == 0) {
                System.out.println("Please select valid stat");
            }else{
                if(define.equals("Human")){
                    player.setWis(Stats[num - 1] + 1);
                }else if(define.equals("Dwarf")){
                    player.setWis(Stats[num - 1] + 1);
                }else {
                    player.setWis(Stats[num - 1]);
                }
                PlayerStats[3] = player.getWis();
                Stats[num - 1] = 0;
                printStats();
                wisLoop = false;
            }

        }
    }
    public void setINT(){
        boolean intLoop = true;
        while (intLoop != false) {
            System.out.println("Select Intelligence score. (1-6)");
            int num = GetInt();
            if (num > 6 || num < 1){
                System.out.println("Please select valid option");
            }else if(Stats[num - 1] == 0) {
                System.out.println("Please select valid stat");
            }else{
                if (define.equals("Human")){
                    player.setInt(Stats[num - 1] + 1);
                }else if(define.equals("Elf")){
                    player.setInt(Stats[num - 1] + 1);
                }else {
                    player.setInt(Stats[num - 1]);
                }
                PlayerStats[4] = player.getInt();
                Stats[num - 1] = 0;
                printStats();
                intLoop = false;
            }

        }
    }
    public void setCHA(){
        boolean chaLoop = true;
        while (chaLoop != false) {
            System.out.println("Select Charisma score. (1-6)");
            int num = GetInt();
            if (num > 6 || num < 1){
                System.out.println("Please select valid option");
            }else if(Stats[num - 1] == 0) {
                System.out.println("Please select valid stat");
            }else{
                if (define.equals("Human")){
                    player.setCha(Stats[num - 1] + 1);
                }else {
                    player.setCha(Stats[num - 1]);
                }
                PlayerStats[5] = player.getCha();
                Stats[num - 1] = 0;
                printStats();
                chaLoop = false;
            }

        }
    }

  public void printStats(){
      int num = 1;
      for (int i = 0; i < Stats.length; i++) {
          System.out.println(num + ": " + Stats[i]);
          num++;
      }
  }

    private String GetString() {
        try {
            return bread.readLine();
        }
        catch (Exception ex) {
            // TODO something
        }
        return null;
    }

    private int GetInt() {
        try {
            return Integer.parseInt(GetString());
        } catch (Exception ex) {
            // TODO something
        }
        // Failed
        return -1;
    }
}
