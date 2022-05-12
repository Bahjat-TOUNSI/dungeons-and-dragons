package equipment;

import characters.heroes.Hero;
import game.ISurprise;

public abstract class Equipment implements ISurprise {



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
     */
    public Equipment( int power, String  name){
        this.power = power;
        this.name = name;
    }



    public abstract String openSurprise(Hero hero);


}