package equipment;

import characters.heroes.Hero;
import game.Surprise;

public abstract class Equipment implements Surprise {



    private int power;
    private String name;


    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }


    public void setPower(int power) {
        this.power = power;
    }

    /**
     *
     * @param power the number of points (force or life) that are given by the equipment
     * @param name the name of the equipment found on the ground(potion, spell, weapon)
     */
    public Equipment( int power, String  name){
        this.power = power;
        this.name = name;
    }
}