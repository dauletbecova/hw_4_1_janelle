import java.util.ArrayList;

public class Team {
    private ArrayList<Main> players;

    public Team() {
        players = new ArrayList<>();
    }

    public void addPlayer(Main player) {
        players.add(player);
    }

    public ArrayList<Main> getPlayers() {
        return players;
    }
}
