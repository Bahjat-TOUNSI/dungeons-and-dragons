package game;

import characters.monsters.Dragon;
import characters.monsters.Goblin;
import characters.monsters.Sorcerer;
import equipment.EmptySquare;
import equipment.potions.LargePotion;
import equipment.potions.NormalPotion;
import equipment.spells.Fireball;
import equipment.spells.Lightning;
import equipment.weapons.Hammer;
import equipment.weapons.Sword;

import java.util.Random;

public class Square {

    ISurprise surprise;

    public Square(){

        Random random = new Random();
        int randomSquareType = random.nextInt(100 - 1) + 1;

        if (randomSquareType > 70){
            int randomMonsterType = random.nextInt(100 - 1) + 1;
            if(randomMonsterType > 66){
                surprise = new Goblin();
            } else if (randomMonsterType > 33){
                surprise = new Dragon();
            } else {
                surprise = new Sorcerer();
            }
        } else if(randomSquareType > 30){
            int randomEquipmentType = random.nextInt(100 - 1) + 1;
            if(randomEquipmentType > 66){
                int randomPotionType = random.nextInt(100 - 1) + 1;
                if(randomPotionType > 50){
                    surprise = new LargePotion();
                } else {
                    surprise = new NormalPotion();
                }
            } else if (randomEquipmentType > 33){
                int randomSpellType = random.nextInt(100 - 1) + 1;
                if(randomSpellType > 50){
                    surprise = new Lightning();
                } else {
                    surprise = new Fireball();
                }
            } else {
                int randomWeaponType = random.nextInt(100 - 1) + 1;
                if(randomWeaponType > 50){
                    surprise = new Hammer();
                } else {
                    surprise = new Sword();
                }
            }
        } else {
            surprise = new EmptySquare();
        }
    }


    public ISurprise getSurprise(){
        return surprise;
    }

}