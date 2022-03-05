package edu.Neumont.oop.Model;

import java.util.Random;

public class MonsterFactory {

    public Monster gen_Monster(){

        Random rnd = new Random();
        int generate = rnd.nextInt(20);
        Monster monster;
        switch (generate) {
            case 0:
                monster = new Skeleton();
                System.out.println("A Skeleton appears");
                break;
            case 1:
                monster = new Zombie();
                System.out.println("A Zombie appears");
                break;
            case 2:
                monster = new Troll();
                System.out.println("A Troll appears");
                break;
            case 3:
                monster = new Gargoyle();
                System.out.println("A Gargoyle appears");
                break;
            case 4:
                monster = new Ogre();
                System.out.println("An Ogre appears");
                break;
            case 5:
                monster = new Owlbear();
                System.out.println("An Owlbear appears");
                break;
            case 6:
                monster = new HookHorror();
                System.out.println("A Hook Horror appears");
                break;
            case 7:
                monster = new Mimic();
                System.out.println("A Mimic appears");
                break;
            case 8:
                monster = new AnimatedArmor();
                System.out.println("An Animate Armor appears");
                break;
            case 9:
                monster = new Bear();
                System.out.println("A Bear appears");
                break;
            case 10:
                monster = new Bulette();
                System.out.println("A Bulette appears");
                break;
            case 11:
                monster = new Cockatrice();
                System.out.println("A Cockatrice appears");
                break;
            case 12:
                monster = new Cultist();
                System.out.println("A Cultist appears");
                break;
            case 13:
                monster = new BlackPudding();
                System.out.println("A Black Pudding appears");
                break;
            case 14:
                monster = new Ettin();
                System.out.println("An Ettin appears");
                break;
            case 15:
                monster = new Ghost();
                System.out.println("A Ghost appears");
                break;
            case 16:
                monster = new Griffon();
                System.out.println("A Griffon appears");
                break;
            case 17:
                monster = new Minotaur();
                System.out.println("A Minotaur appears");
                break;
            case 18:
                monster = new Slaad();
                System.out.println("A Slaad appears");
                break;
            case 19:
                monster = new Doppelganger();
                System.out.println("An figure that looks exactly like you appears");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + generate);
        }
        return monster;
    }

    public Monster generate_Boss(){
        Random rnd = new Random();
        int generate = rnd.nextInt(5);
        Monster monster;
        switch (generate){
            case 0:
               monster = new Tarrasque();
               break;
            case 1:
                monster = new Balor();
                break;
            case 2:
                monster = new Dragon();
                break;
            case 3:
                monster = new PurpleWorm();
                break;
            case 4:
                monster = new SkeletalColossus();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + generate);
        }
       return monster;
    }
}
