public class Lucky extends Main {
    public Lucky(String name) {
        super(name, 100, 20);
    }

    @Override
    public void takeTurn(Team team, Boss boss) {
        if (Math.random() < 0.5) {  // 50% шанс
            System.out.println(getName() + " уклaнился от удара!");
        } else {
            takeDamage(boss.getDamage());
        }
    }
}
