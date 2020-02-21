import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    private List<Player> players = new ArrayList<>();

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void add(Player player) {
        players.add(player);
    }

    public void sortByNameUp() {
        Collections.sort(players);
        players.forEach(System.out::println);
    }

    public void sortByNameDown() {
        SortByNameDown sortByNameDown = new SortByNameDown();
        Collections.sort(players, sortByNameDown);
        players.forEach(System.out::println);
    }

    public void sortByScoreUp() {
        SortByScoreUp scoreUp = new SortByScoreUp();
        Collections.sort(players, scoreUp);
        players.forEach(System.out::println);
    }

    public void sortByScoreDown() {
        Collections.sort(players, (o1, o2) -> {
            if (o1.getScore() > o2.getScore())
                return -1;
            if (o1.getScore() < o2.getScore())
                return 1;
            return 0;
        });
        players.forEach(System.out::println);
    }

    class SortByScoreUp implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            if (o1.getScore() > o2.getScore())
                return 1;
            if (o1.getScore() < o2.getScore())
                return -1;
            return 0;
        }
    }
}
