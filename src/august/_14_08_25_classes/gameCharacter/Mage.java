package august._14_08_25_classes.gameCharacter;

public class Mage extends GameCharacter {

    public Mage(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void takeDamage(int count) {
        setHealth(health - count);
    }

    @Override
    public void attack(GameCharacter gameCharacter) {
        gameCharacter.takeDamage(power);
        System.out.println(getName() + " is attacking " + gameCharacter.getName() + " using magic");
    }

    @Override
    public void heal() {
        setHealth(health + 50);
        System.out.println("Mage is healing 50 HP");
    }

    @Override
    public void heal(int healthCount) {
        setHealth(health + healthCount);
        System.out.println("Mage is healing " + health + " HP");
    }
}
