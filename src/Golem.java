public class Golem extends Main {
    public Golem(String name) {
        super(name, 200, 10);
    }

    @Override
    public void takeTurn(Team team, Boss boss) {
        if (boss != null && boss.isAlive()) {
            int damage = boss.getDamage() / 5;
            takeDamage(damage);
        }
    }
}
