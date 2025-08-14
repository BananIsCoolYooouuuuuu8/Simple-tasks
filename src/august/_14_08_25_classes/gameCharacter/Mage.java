package august._14_08_25_classes.gameCharacter;

public class Mage extends GameCharacter {

    public Mage(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void takeDamage(int count) {
        setHealth(health - count);
    }

    @Override
    public void attack(GameCharacter gameCharacter) {
        gameCharacter.takeDamage(power);
        System.out.println("Mage is attacking");
    }

    @Override
    public void heal() {
        setHealth(health + 50);
        System.out.println("Mage is healing 50 HP");
    }

    public void heal(int healthCount) {
        setHealth(health + healthCount);
        System.out.println("Mage is healing " + health + " HP");
    }
}
