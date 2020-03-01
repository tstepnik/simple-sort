import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player("Robert", 100));
        players.add(new Player("Johny", 234));
        players.add(new Player("BigStan", 512));
        players.add(new Player("Easyy", 101));
        players.add(new Player("King", 230));

        System.out.println("Lista nieposortowana: ");
        printPlayers(players);

        System.out.println();
        SortPlayers.sortByScoreDescending(players);
        printPlayers(players);

        System.out.println();
        SortPlayers.sortByScoreAscending(players);
        printPlayers(players);

        System.out.println();
        SortPlayers.sortByNameDescending(players);
        printPlayers(players);

        System.out.println();
        SortPlayers.sortByNameAscending(players);
        printPlayers(players);

    }

    private static void printPlayers(List<Player> list) {
        list.forEach(System.out::println);
    }
}
