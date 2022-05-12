package equipment;

import characters.heroes.Hero;
import game.ISurprise;

public class EmptySquare implements ISurprise {
    public String openSurprise(Hero hero){
        return "La case est vide ! ";
    }
}
