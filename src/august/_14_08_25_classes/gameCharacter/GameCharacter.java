package august._14_08_25_classes.gameCharacter;

public abstract class GameCharacter {

    protected String name;
    protected int health;
    protected int power;

    public GameCharacter(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attack(GameCharacter gameCharacter);
    public abstract void heal();
    public abstract void heal(int healthCount);
    public abstract void takeDamage(int count);
}
