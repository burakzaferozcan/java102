public class Asistan extends Akademisyen {
    private String ofisSaati;

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap() {
        System.out.println(this.getAdSoyad() + " quiz yapıyor...");
    }

    //    super classta abstract bir method tanımlandıysa o method alt sınıfta kullanılmak zorunda
    @Override
    public void derseGir(String dersSaati) {
        System.out.println("abstraction örneği : " + this.getAdSoyad() + " derse " + dersSaati + " saatinde giriş yaptı");
    }
    //    super classta abstract bir method tanımlandıysa o method alt sınıfta kullanılmak zorunda
}
