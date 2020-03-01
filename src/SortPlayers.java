import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPlayers {

    public static void sortByNameAscending(List<Player> players) {
        Collections.sort(players);
    }

    public static void sortByNameDescending(List<Player> players) {
        SortByNameDescending sortByNameDescending = new SortByNameDescending();
        players.sort(sortByNameDescending);
    }

    public static void sortByScoreAscending(List<Player> players) {
        SortByScoreAscending scoreAscending = new SortByScoreAscending();
        players.sort(scoreAscending);
    }

    public static void sortByScoreDescending(List<Player> players) {
        players.sort((o1, o2) -> Integer.compare(o2.getScore(), o1.getScore()));
    }

    static class SortByScoreAscending implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return Integer.compare(o1.getScore(), o2.getScore());
        }
    }
}
