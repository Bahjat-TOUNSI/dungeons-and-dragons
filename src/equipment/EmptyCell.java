package equipment;

import characters.heroes.Hero;
import game.Surprise;

public class EmptyCell implements Surprise {
    public String openSurprise(Hero hero){
        return "La case est vide ! ";
    }
}
