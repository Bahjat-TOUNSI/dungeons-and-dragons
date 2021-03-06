package equipment.spells;

import characters.heroes.Hero;
import characters.heroes.Warrior;
import characters.heroes.Wizard;
import equipment.Equipment;

public abstract class Spell extends Equipment {

    public Spell(int power, String name) {
        super(power, name);
    }

    public String openSurprise(Hero hero) {
        if (hero instanceof Wizard) {
            if (hero.getForce() + this.getPower() > hero.getMaxAttackForce()) {
                hero.setForce(hero.getMaxAttackForce());
            } else {
                hero.setForce(hero.getForce() + this.getPower());
            }
            return "Vous avez ramassé un sort de type " + this.getName() + ". Elle vous apporte " + this.getPower() + " points d'attaque.";
        } else {
            return "Vous avez ramassé un sort de type " + this.getName() + " mais vous êtes un " + hero.getClass().getSimpleName() + " et vous ne pouvez pas l'utiliser. Vous ne bénéficiez pas de points d'attaque supplémentaires.";
        }
    }
}