public class Main {
    public static void main(String[] args) {
        System.out.println("program başladı");

        int a = 0;
        int b = 20;
        try {
            System.out.println("bölme işlemi başladı");
            System.out.println(b/a);
            System.out.println("bölme işlemi bitti");
        }catch (Exception e) {
            System.out.println("hata yakalandı");
        }
        System.out.println("program bitti");
    }
}
