package characters;

public abstract class Character {


    private String name;
    private int lifePoints;
    private int force;


    /**
     *
     * @param name
     * @param lifePoints
     * @param force
     */
    public Character(String name, int lifePoints, int force){
        this.lifePoints = lifePoints;
        this.name = name;
        this.force= force;
    }




    public int getLifePoints(){
        return lifePoints;
    }

    public int getForce(){
        return force;
    }

    public String getName() {
        return name;
    }



    /**
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @param lifePoints
     */
    public void  setLifePoints(int lifePoints){

        if(lifePoints < 0){
            this.lifePoints = 0;
        } else {
            this.lifePoints = lifePoints;
        }
    }

    public void setForce(int force) {
        this.force = force;
    }


    /**
     * Diminishes the lifePoints of a character (hero or monster) according to the opponent's force
     * @param attackingCharacter the character who is attacking
     */
    public void takeBlow(Character attackingCharacter){

        setLifePoints(getLifePoints()-attackingCharacter.force);
    }
}