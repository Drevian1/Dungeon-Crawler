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

    public void menu(){
        CharacterMenu();

    }

    public void printCharacter(){
        System.out.println("Race: " + define + '\n' + "Name: " + stats.getName());

        System.out.println("AC: " + stats.getArmorClass());

        stats.printStats();
    }

    public void CharacterMenu(){

        boolean createLoop = true;



            while (createLoop != false) {

                System.out.println("Would you like to make a new character? Y or N");
                String makeNew = GetString().toLowerCase(Locale.ROOT);
                if (makeNew.equals("y")) {
                    setRace();
                    StatMenu();
                    stats.setArmorClass(stats.getArmorClass() + setACMod());
                    setName();
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
    public void StatMenu(){

        boolean statLoop = true;
//        boolean reroll = true;
//        boolean rollLoop = true;
//        boolean strLoop = true;
//        boolean dexLoop = true;
//        boolean conLoop = true;
//        boolean wisLoop = true;
//        boolean intLoop = true;
//        boolean chaLoop = true;
//        boolean change = false;


        while (statLoop != false) {

            getStats();
            printStats();
            setSTR();
            setDEX();
            setCON();
            setWIS();
            setINT();
            setCHA();
            stats.printStats();
            statLoop = false;

//            stats.generateStats();
//
//            if (reroll == true) {
//                while (rollLoop != false) {
//                    System.out.println("Would you like to reroll stats? Y or no");
//                    String loop = GetString().toLowerCase(Locale.ROOT);
//                    if (loop.equals("y")) {
//                        stats.generateStats();
//                    } else if (loop.equals("n")) {
//                        rollLoop = false;
//                    }else{
//                        System.out.println("Enter valid String");
//                    }
//
//                }
//            }
//            while (change != true){
//            while (strLoop != false) {
//                System.out.println("Select stat for STR (1-6)");
//                int str = GetInt();
//                if (str < 7 && str > 0) {
//                    stats.setStr(str);
//                    strLoop = false;
//
//                } else {
//                    System.out.println("Input valid num");
//                }
//            }
//            while (dexLoop != false) {
//                System.out.println("Select stat for DEX (1-6)");
//                int dex = GetInt();
//                if (dex < 7 && dex > 0) {
//                    stats.setDex(dex);
//                    dexLoop = false;
//                } else {
//                    System.out.println("Input valid num");
//                }
//            }
//            while (conLoop != false) {
//                System.out.println("Select stat for CON (1-6)");
//                int con = GetInt();
//                if (con < 7 && con > 0) {
//                    stats.setCon(con);
//                    conLoop = false;
//                } else {
//                    System.out.println("Input valid num");
//                }
//            }
//            while (wisLoop != false) {
//                System.out.println("Select stat for WIS (1-6)");
//                int wis = GetInt();
//                if (wis < 7 && wis > 0) {
//                    stats.setWis(wis);
//                    wisLoop = false;
//                } else {
//                    System.out.println("Input valid num");
//                }
//            }
//            while (intLoop != false) {
//                System.out.println("Select stat for INT (1-6)");
//                int anInt = GetInt();
//                if (anInt < 7 && anInt > 0) {
//                    stats.setInt(anInt);
//                    intLoop = false;
//                } else {
//                    System.out.println("Input valid num");
//                }
//            }
//            while (chaLoop != false) {
//                System.out.println("Select stat for CHA (1-6)");
//                int cha = GetInt();
//                if (cha < 7 && cha > 0) {
//                    stats.setCha(cha);
//                    chaLoop = false;
//                } else {
//                    System.out.println("Input valid num");
//                }
//            }
//            stats.printStats();
//            System.out.println("Would you like to change your stat application? Y or N");
//            String last = GetString().toLowerCase(Locale.ROOT);
//            if(last.equals("y")){
//                change = false;
//            }else if(last.equals("n")){
//                change = true;
//                statLoop = false;
//            }else{
//                System.out.println("Enter valid string");
//            }
//        }
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
   public int setACMod(){
        int mod = 0;
        int dex = stats.getDex();
        if (dex <= 5){
            mod = -3;
        }else if(dex <= 7 && dex > 5){
            mod = -2;
        }else if(dex <= 9 && dex > 7){
            mod = -1;
        }else if(dex <=11 && dex >9){
            mod = 0;
        }else if(dex <= 13 && dex > 11){
            mod = 1;
        }else if(dex <=15 && dex > 13){
            mod = 2;
        }else if(dex <= 17 && dex > 15){
            mod = 3;
        }else if (dex <=19 && dex > 17){
            mod = 4;
        }else if(dex >= 20){
            mod = 5;
        }else{
            mod = 0;
        }
        return mod;
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
