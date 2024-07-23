public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void sinavYap() {
        System.out.println(this.getAdSoyad() + " Sınav yapıyor.");
    }

    public void senatoToplanti() {
        System.out.println(this.getAdSoyad() + " Toplantıya Girdi.");
    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " Öğretim Görevlisi B kapısından giriş yaptı.");
    }

    //    super classta abstract bir method tanımlandıysa o method alt sınıfta kullanılmak zorunda
    @Override
    public void derseGir(String dersSaati) {
        System.out.println(this.getAdSoyad() + " derse " + dersSaati + " saatinde giriş yaptı");
    }
    //    super classta abstract bir method tanımlandıysa o method alt sınıfta kullanılmak zorunda

}
