public class User {
    public String name;
    public static int counter = 0;

    public User(String name) {
        this.name = name;
        counter++;
    }

    {
        System.out.println("ben static bir kod bloğuyum static anahtar kelimesi ile üretilmem her nesne üretildiğinde tekrar çalışırım");
    }

    static {
        System.out.println("ben static bir kod bloğuyum static anahtar kelimesi ile üretilirim sınıftan nesne üretilmese de çalışırım");
    }
}
