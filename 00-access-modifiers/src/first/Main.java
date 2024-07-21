package first;

public class Main {

    public static void main(String[] args) {
        First a = new First("Hello World!", "first package main protected deneme");
        a.showStr();
//        aynı pekt içerisimdem protected değişkene erişilebilir
        System.out.println(a.deneme);
    }
}
