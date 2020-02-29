import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPlayers {

    public void sortByNameAscending(List players) {
        Collections.sort(players);
    }

    public void sortByNameDescending(List players) {
        SortByNameDown sortByNameDescending = new SortByNameDown();
        Collections.sort(players, sortByNameDescending);
    }

    public void sortByScoreAscending(List players) {
        sortByScoreAscending scoreAscending = new sortByScoreAscending();
        Collections.sort(players, scoreAscending);
    }

    public void sortByScoreDescending(List<Player> players) {
        Collections.sort(players, (o1, o2) -> {
            if (o1.getScore() > o2.getScore())
                return -1;
            if (o1.getScore() < o2.getScore())
                return 1;
            return 0;
        });
    }

    class sortByScoreAscending implements Comparator<Player> {

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
