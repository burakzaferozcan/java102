public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Burak Zafer Özcan", 1);
        Player p2 = new Player("Şevval Çimen", 2);

        System.out.println(p1.name);
        System.out.println(p2.game);
//        static bir değişken bu şekilde çağırılabilir
        System.out.println(Player.game);


        p1.increase();
        System.out.println(Player.count);
        p2.increase();
        System.out.println(Player.count);


    }
}