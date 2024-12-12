public class Thor extends Main {
    public Thor(String name) {
        super(name, 120, 30);  // Урон Тора
    }

    @Override
    public void takeTurn(Team team, Boss boss) {
        if (Math.random() < 0.3) {  // 30% шанс на оглушение
            boss.stun();
            System.out.println(getName() + " оглушил босса!");
        } else {
            boss.takeDamage(getDamage());
        }
    }
}
