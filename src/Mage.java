public class Mage extends Hero {
    private String spell;
    private String potion;

    public Mage() {
        this.setName("The White Wizard");
        this.setLifePoints(3);
        this.setAttack(8);
        this.setSpell("ignite");
        this.setPotion("heal");
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getPotion() {
        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }

    @Override
    public String toString() {
        return "Your name: " + this.getName() + "\n"
                + "HP: " + this.getLifePoints() + "\n"
                + "Attack power: " + this.getAttack() + "\n"
                + "Spell: " + this.getSpell() + "\n"
                + "Potion: " + this.getPotion();
    }
}
