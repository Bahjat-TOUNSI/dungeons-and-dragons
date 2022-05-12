package characters.heroes;
import characters.Character;
import equipment.Equipment;
import equipment.spells.Spell;
import equipment.weapons.Weapon;

public abstract class Hero extends Character {


    private String image;
    private int maxLifePoints;
    private int maxAttackForce;

    private int position;


    public String getImage() {
        return image;
    }

    public int getMaxAttackForce() {
        return maxAttackForce;
    }

    public int getMaxLifePoints() {
        return maxLifePoints;
    }
    public int getPosition() {
        return position;
    }


    public void setImage(String imagePath) {
        this.image = imagePath;
    }

    public void setMaxLifePoints(int maxLifePoints) {
        this.maxLifePoints = maxLifePoints;
    }

    public void setMaxAttackForce(int maxAttackForce) {
        this.maxAttackForce = maxAttackForce;
    }
    public void setPosition(int position) {
        this.position = position;
    }


    /**
     * @param name
     * @param lifePoints
     * @param force
     * @param maxLifePoints
     * @param maxAttackForce
     */
    public Hero(String name, int lifePoints, int force, int maxLifePoints, int maxAttackForce) {
        super(name, lifePoints, force);
        this.maxAttackForce = maxAttackForce;
        this.maxLifePoints = maxLifePoints;
    }


    /**
     * @return a String with the hero's characteristics
     */
    @Override
    public String toString() {
        return "Vous vous appelez " + getName() + ". Vous êtes un " + this.getClass().getSimpleName() + ". Vous avez " + getLifePoints() + " points de vie et " + getForce() +" points d'attaque.";
    }


}
