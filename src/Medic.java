public class Medic extends Main {
    private int healAmount;

    public Medic(String name, int healAmount) {
        super(name, 100, 0);  // Медик не наносит урона
        this.healAmount = healAmount;
    }

    @Override
    public void takeTurn(Team team, Boss boss) {
        for (Main m : team.getPlayers()) {
            if (m.isAlive() && m != this && m.getHealth() < 100) {
                m.heal(healAmount);
                break;
            }
        }
    }

    public int getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }
}
