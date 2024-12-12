public class Boss {
    private int health;
    private int damage;
    private boolean stunned;

    public Boss(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.stunned = false;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getDamage() {
        return damage;
    }

    public void stun() {
        stunned = true;
    }

    public void nextTurn() {
        if (stunned) {
            stunned = false;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}
