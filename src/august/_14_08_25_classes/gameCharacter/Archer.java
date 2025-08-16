package august._14_08_25_classes.gameCharacter;

public class Archer extends GameCharacter {


    public Archer(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void takeDamage(int count) {
        setHealth(health - count);
    }

    @Override
    public void attack(GameCharacter gameCharacter) {
        gameCharacter.takeDamage(power);
        System.out.println("Archer is attacking");
    }

    @Override
    public void heal() {
        setHealth(health + 50);
        System.out.println("Archer is healing 50");
    }

    @Override
    public void heal(int healthCount) {
        setHealth(health + healthCount);
        System.out.println("Archer is healing " + health + " HP");
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Alex", 1000, 300);
        Mage mage = new Mage("Bob", 500, 500);
        Archer archer = new Archer("Paul", 700, 200);
        warrior.takeDamage(warrior.power);
        mage.attack(archer);
        System.out.println(archer.health);
        mage.heal(500);
        System.out.println(mage.health);
    }
}
