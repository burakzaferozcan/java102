public class Main {
    public static void main(String[] args) {
        int a=10;
//        Autoboxing
        Integer b=a;

//        Boxing
        Integer c=Integer.valueOf(a);

//        Autounboxing
        int d=c;

//        Unboxing
        int e=c.intValue();


    }
}
