public class Main {
    public static void main(String[] args) {
        Sorting sort = new Sorting();

        sort.add(new Player("Robert", 100));
        sort.add(new Player("Johny", 234));
        sort.add(new Player("MutherFucker666", 512));
        sort.add(new Player("EasyKill", 101));
        sort.add(new Player("PussyMagness", 230));

        sort.getPlayers().forEach(System.out::println);
        System.out.println();
        sort.sortByScoreDown();
        System.out.println();
        sort.sortByScoreUp();
        System.out.println();
        sort.sortByNameDown();
        System.out.println();
        sort.sortByNameUp();

    }
}
