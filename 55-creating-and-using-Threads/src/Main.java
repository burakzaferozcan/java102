public class Main {
    public static void main(String[] args) {
        System.out.println("uygulama başladı !");
        for (int i=0;i<10;i++) {
            System.out.println(i);
        }
        System.out.println("uygulama bitti !");

        Counter c1=new Counter();
        Counter c2=new Counter();
        c1.start();
        c2.start();

    }
}
