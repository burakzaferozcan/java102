package third;

import first.First;

public class Third {
    public static void main(String[] args) {
        First a = new First("Hello World!", "third package protected deneme");

//        farklı bir paketten protected değişkene erişilemez
//        System.out.println(a.deneme);

    }
}
