public class MainGame {
    public static void main(String[] args) {
        Team team = new Team();
        Boss boss = new Boss(500, 50);  // Примерные параметры босса

        team.addPlayer(new Medic("Medic", 10));
        team.addPlayer(new Golem("Golim"));
        team.addPlayer(new Lucky("Lucky"));
        team.addPlayer(new Witcher("Witcher"));
        team.addPlayer(new Thor("Thor"));

        while (boss.isAlive()) {
            for (Main player : team.getPlayers()) {
                if (player.isAlive()) {
                    player.takeTurn(team, boss);
                }
            }

            boss.nextTurn();
        }

        System.out.println("Босс уничтожен!");
    }
}
