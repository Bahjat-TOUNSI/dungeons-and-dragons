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
     * the hero method is used to create a hero with the following parameters
     * @param name sets the hero's name
     * @param lifePoints defines the hero's life points
     * @param force defines the hero's attack force
     * @param maxLifePoints defines the hero's maximum life points
     * @param maxAttackForce defines the hero's maximum attack force
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
