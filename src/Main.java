import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortPlayers sortPlayers = new SortPlayers();
        List<Player> players = new ArrayList<>();

        players.add(new Player("Robert", 100));
        players.add(new Player("Johny", 234));
        players.add(new Player("BigStan", 512));
        players.add(new Player("Easyy", 101));
        players.add(new Player("King", 230));

        System.out.println("Lista nieposortowana: ");
        players.forEach(System.out::println);

        System.out.println();
        sortPlayers.sortByScoreDescending(players);
        players.forEach(System.out::println);

        System.out.println();
        sortPlayers.sortByScoreAscending(players);
        players.forEach(System.out::println);

        System.out.println();
        sortPlayers.sortByNameDescending(players);
        players.forEach(System.out::println);

        System.out.println();
        sortPlayers.sortByNameAscending(players);
        players.forEach(System.out::println);
    }
}
