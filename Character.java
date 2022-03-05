package edu.Neumont.oop.Model;

import edu.Neumont.oop.Model.Race;

import java.util.Random;

public class Character {
    Race race;
    PClass pClass;

    public PClass getpClass() {
        return pClass;
    }

    public void setpClass(PClass pClass) {
        this.pClass = pClass;
    }

    String name;
    int level = 1;
    int experience = 0;
    int Health;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Random random = new Random();
    int Str;
    int Dex;
    int Con;
    int Wis;
    int Int;
    int Cha;
    public int generateStat(){
        Dice die = new Dice();
        int stat = die.rollMultiple(3,6);
        return stat;
    }
    public int setDexMod(){
        int mod = 0;
        int dex = getDex();
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
    public int setChaMod(){
        int mod = 0;
        int dex = getCha();
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
    public int setWisMod(){
        int mod = 0;
        int dex = getWis();
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
    public int setIntMod(){
        int mod = 0;
        int dex = getInt();
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
    public int setConMod(){
        int mod = 0;
        int dex = getCon();
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
    public int setStrMod(){
        int mod = 0;
        int dex = getStr();
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

    public int getStr() {
        return Str;
    }

    public void setStr(int str) {
        Str = str;
    }

    public int getDex() {
        return Dex;
    }

    public void setDex(int dex) {
        Dex = dex;
    }

    public int getCon() {
        return Con;
    }

    public void setCon(int con) {
        Con = con;
    }

    public int getWis() {
        return Wis;
    }

    public void setWis(int wis) {
        Wis = wis;
    }

    public int getInt() {
        return Int;
    }

    public void setInt(int anInt) {
        Int = anInt;
    }

    public int getCha() {
        return Cha;
    }

    public void setCha(int cha) {
        Cha = cha;
    }

    public void printStats(){
        System.out.println("STR: " + getStr() + '\n' + "DEX: " + getDex() + '\n' + "CON: " + getCon()
                + '\n' + "WIS: " + getWis() + '\n' + "INT: " + getInt() + '\n' + "CHA: " + getCha());
    }



    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void changeLevel(){
        if (getExperience() >= 355000){
            level = 20;
        }else if(getExperience() >= 305000){
            level = 19;
        }else if(getExperience() >= 265000){
            level = 18;
        }else if(getExperience() >= 225000){
            level =17;
        }else if(getExperience() >= 195000){
            level = 16;
        }else if(getExperience() >= 165000){
            level = 15;
        }else if(getExperience() >= 140000){
            level = 14;
        }else if(getExperience() >= 120000){
            level = 13;
        }else if(getExperience() >= 100000){
            level = 12;
        }else if(getExperience() >= 85000){
            level = 11;
        }else if(getExperience() >= 64000){
            level = 10;
        }else if(getExperience() >= 48000){
            level = 9;
        }else if(getExperience() >= 34000){
            level = 8;
        }else if(getExperience() >= 23000){
            level = 7;
        }else if(getExperience() >= 14000){
            level = 6;
        }else if(getExperience() >= 6500){
            level = 5;
        }else if(getExperience() >= 2700){
            level = 4;
        }else  if(getExperience() >= 900){
            level = 3;
        }else if(getExperience() >= 300){
            level = 2;
        }else{
            level = 1;
        }
    }
}
