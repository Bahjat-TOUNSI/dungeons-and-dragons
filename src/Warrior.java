public class Warrior extends Hero {
        private String weaponType;
        private String shield;

        public Warrior() {
                this.setName("Atilla The Hun");
                this.setLifePoints(5);
                this.setAttack(5);
                this.setWeaponType("Axe");
                this.setShield("Shield");
        }

        public String getWeaponType() {
                return weaponType;
        }

        public void setWeaponType(String weaponType) {
                this.weaponType = weaponType;
        }

        public String getShield() {
                return shield;
        }

        public void setShield(String shield) {
                this.shield = shield;
        }

        @Override
        public String toString() {
                return "Your name: " + this.getName() + "\n"
                        + "HP: " + this.getLifePoints() + "\n"
                        + "Attack power: " + this.getAttack() + "\n"
                        + "Weapon: " + this.getWeaponType() + "\n"
                        + "Defense: " + this.getShield();
        }
}