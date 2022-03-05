package edu.Neumont.oop.Controller;

import edu.Neumont.oop.Model.*;
import edu.Neumont.oop.Model.Character;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Locale;

public class DoWork {

    private BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
    int[] PlayerStats = new int[6];
    int[] Stats = new int[6];
    Character stats = new Character();
    Race race;
    String define = "";
    PClass pClass;
    Encounter encounter = new Encounter();
    Monster monster;

    public void menu(){
        CharacterMenu();

    }

    public void printCharacter(){
        System.out.println("Race: " + define + '\n' + "Name: " + stats.getName() + "Class: " + stats.getpClass());



        stats.printStats();
    }
    public void combat(){
        boolean combatLoop = true;
        while (combatLoop != false){
            System.out.println("What would you like to do? " + '\n' + "A: Attack" + '\n' + "B: Cast Spell"+ '\n' + "Disengage");
        }
    }

    public void CharacterMenu(){

        boolean createLoop = true;



            while (createLoop != false) {

                System.out.println("Would you like to make a new character? Y or N");
                String makeNew = GetString().toLowerCase(Locale.ROOT);
                if (makeNew.equals("y")) {
                    setRace();
                    StatMenu();

                    setName();
                    setClass();
                    printCharacter();
                    createLoop = false;
                } else if (makeNew.equals("n")) {
                    createLoop = false;
                }
            }
        }



    public void setRace(){
        boolean raceLoop = true;
        while (raceLoop != false){
            System.out.println("Select what race you would like your character to be:" + '\n' + "A: Human" + '\n' + "B: Elf" + '\n' + "C: Dwarf");
            String choice = GetString().toLowerCase(Locale.ROOT);
            if (choice.equals("a")){
                race = new Human();
                define = "Human";
                raceLoop = false;
            }else if(choice.equals("b")){
                race = new Elf();
                define = "Elf";
                raceLoop = false;
            }else if(choice.equals("c")){
                race = new Dwarf();
                define = "Dwarf";
                raceLoop = false;
            }else{
                System.out.println("Please enter valid option");
            }
        }
    }
    public void setClass(){
        boolean classLoop = true;
        while (classLoop != false){
            System.out.println("Select what class you would like your character to be:" + '\n' + "A: Fighter" + '\n' + "B: Barbarian" + '\n' + "C: Rogue" + '\n' + "D: Wizard" + '\n' + "E: Paladin");
            String decison = GetString().toLowerCase(Locale.ROOT);
            if (decison.equals("a")){
                pClass = new Fighter();
                classLoop = false;
            }else if(decison.equals("b")){
                pClass = new Barbarian();
                classLoop = false;
            }else if(decison.equals("c")){
                pClass = new Rogue();
                classLoop = false;
            }else if(decison.equals("d")){
                pClass = new Wizard();
                classLoop = false;
            }else if(decison.equals("e")) {
                pClass = new Paladin();
                classLoop = false;
            }else{
                System.out.println("Please enter valid option");
            }
        }
    }
    public void StatMenu(){

        boolean statLoop = true;


        while (statLoop != false) {

            getStats();
            printStats();
            setSTR();
            stats.setStrMod();
            setDEX();
            stats.setDexMod();
            setCON();
            stats.setConMod();
            setWIS();
            stats.setWisMod();
            setINT();
            stats.setIntMod();
            setCHA();
            stats.setChaMod();
            stats.printStats();
            statLoop = false;

     }
   }

   public void setName(){
        boolean nameLoop = true;
        while (nameLoop != false) {
            System.out.println("Enter name for character");
            String name = GetString();
            if (name.isEmpty() || name.isBlank()){
                stats.setName("Hero with no Name");
                nameLoop = false;
            }else {
                stats.setName(name);
                nameLoop = false;
            }
        }
   }



   public void getStats(){

       for (int i = 0; i < Stats.length; i++) {
           Stats[i] = stats.generateStat();

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
                   stats.setStr(Stats[num -1] + 1);
               }else{
                   stats.setStr(Stats[num - 1]);
               }
               PlayerStats[0] = stats.getStr();
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
                   stats.setDex(Stats[num - 1] + 1);
               }else if(define.equals("Elf")){
                   stats.setDex(Stats[num - 1] + 2);
               }else{
                   stats.setDex(Stats[num - 1]);
               }
               PlayerStats[1] = stats.getDex();
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
                    stats.setCon(Stats[num - 1] + 1);
                }else if(define.equals("Dwarf")){
                    stats.setCon(Stats[num - 1] + 2);
                }else {
                    stats.setCon(Stats[num - 1]);
                }
                PlayerStats[2] = stats.getCon();
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
                    stats.setWis(Stats[num - 1] + 1);
                }else if(define.equals("Dwarf")){
                    stats.setWis(Stats[num - 1] + 1);
                }else {
                    stats.setWis(Stats[num - 1]);
                }
                PlayerStats[3] = stats.getWis();
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
                    stats.setInt(Stats[num - 1] + 1);
                }else if(define.equals("Elf")){
                    stats.setInt(Stats[num - 1] + 1);
                }else {
                    stats.setInt(Stats[num - 1]);
                }
                PlayerStats[4] = stats.getInt();
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
                    stats.setCha(Stats[num - 1] + 1);
                }else {
                    stats.setCha(Stats[num - 1]);
                }
                PlayerStats[5] = stats.getCha();
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
