package second;

import first.First;

public class Second {
    public static void main(String[] args) {
        First b = new First("diğer paket second'dan erişim sağlandı","second class protected deneme");
        b.showStr();
    }
}
