public abstract class Main {
    private String name;
    private int health;
    private int damage;
    private boolean isAlive;

    public Main(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.isAlive = true;
    }

    public abstract void takeTurn(Team team, Boss boss);

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isAlive = false;
        }
    }

    public void heal(int amount) {
        if (health + amount > 100) {
            health = 100;
        } else {
            health += amount;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
