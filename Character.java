package edu.Neumont.oop.Model;

import edu.Neumont.oop.Model.Race;

import java.util.Random;

public class Character {
    Race race;
    int armorClass = 10;
    String name;
    int level = 1;
    int experience = 0;

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

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

}
