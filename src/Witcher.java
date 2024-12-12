public class Witcher extends Main {
    public Witcher(String name) {
        super(name, 100, 0);
    }

    @Override
    public void takeTurn(Team team, Boss boss) {
        if (isAlive()) {
            for (Main m : team.getPlayers()) {
                if (!m.isAlive() && this.getHealth() > 0) {
                    m.heal(this.getHealth());
                    this.setHealth(0);
                    this.setIsAlive(false);
                    break;
                }
            }
        }
    }
}
