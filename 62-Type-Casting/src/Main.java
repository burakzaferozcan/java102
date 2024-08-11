public class Main {
    public static void main(String[] args) {
        // todo Widening Casting (Otomatik)
        int a = 10;
        double b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("---------------------------");


        // todo Narrowing Casting (Manuel)
        // Büyük veri tipini daha küçük veri tipine dönüştürme işlemine denir.
        double pi = 3.14;
        int intPi = (int) pi;
        System.out.println(pi);
        System.out.println(intPi);

        // Integer => String Dönüşümü
        int cInt=20;
        String cString=String.valueOf(cInt);
        System.out.println(cInt);
        System.out.println(cString);

        // String => Integer Dönüşümü
        String dString="80";
        int dInt=Integer.parseInt(dString);
        System.out.println(dString);
        System.out.println(dInt);


    }
}
