package first;

public class First {
    // private bir değişken, fonksiyon ya da sınıfa sadece tanımlandığı sınıf içerisinde erişim sağlanabilir
    private String str;

    // protected bir değişken, fonksiyon ya da sınıfa sadece aynı package'daki dosyalardan erişim sağlanılabilir
    protected String deneme;

    public First(String str, String deneme) {
        this.str = str;
        this.deneme = deneme;
    }

    // public bir değişken, fonksiyon ya da sınıfa tüm sınıflar içerisinden erişim sağlanabilir
    public void showStr() {
        System.out.println(this.str);
    }

    public void showProtected() {
        System.out.println(this.str);
    }
}
