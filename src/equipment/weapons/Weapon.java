package equipment.weapons;

import characters.heroes.Hero;
import characters.heroes.Warrior;
import characters.heroes.Wizard;
import equipment.Equipment;

public abstract class Weapon extends Equipment {


    public Weapon( int power, String name){
        super(power, name);
    }

    public String openSurprise(Hero hero) {
        if (hero instanceof Warrior) {
            if (hero.getForce() + this.getPower() > hero.getMaxAttackForce()) {
                hero.setForce(hero.getMaxAttackForce());
                return "Vous avez ramassé une arme de type " + this.getName() + ". Elle vous apporte " + this.getPower() + " points d'attaque, mais vous ne pouvez avoir que " + hero.getMaxAttackForce() + " points d'attaque. Vous avez donc " + hero.getForce() + " points d'attaque";
            } else {
                hero.setForce(hero.getForce() + this.getPower());
                return "Vous avez ramassé une arme de type " + this.getName() + ". Elle vous apporte " + this.getPower() + " points d'attaque.";
            }

        } else {
            return "Vous avez ramassé une arme de type " + this.getName() + " mais vous êtes un " + hero.getClass().getSimpleName() + " et vous ne pouvez pas l'utiliser. Vous ne bénéficiez pas de points d'attaque supplémentaires.";
        }
    }

}
