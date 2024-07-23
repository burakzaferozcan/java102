public class Patika {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("burak", "055555555", "burak@gmail.com");
        System.out.println(c1.getAdSoyad());
        c1.giris();
        Akademisyen a1 = new Akademisyen("zafer", "054444444", "zafer@gmail.com", "CENG", "Doçent");
        System.out.println(a1.getAdSoyad());
        a1.giris();
        a1.derseGir();
        Memur m1 = new Memur("özcan", "033333333", "ozcan@gmail.com", "Bilgi İşlem", "09.00-17.00");
        System.out.println(m1.getAdSoyad());
        m1.giris();
        m1.calis();
        OgretimGorevlisi o1 = new OgretimGorevlisi("Şevval", "0777777777", "sevval@gmail.com", "CENG", "Prof", "5");
        System.out.println(o1.getAdSoyad());
        o1.giris();
        o1.sinavYap();
        Asistan as1 = new Asistan("mahmut", "09999999999", "mahmut@gmail.com", "MAT", "asistan", "09.00-17.00");
        System.out.println(as1.getAdSoyad());
        as1.giris();
        as1.quizYap();
        LabAsistan las1 = new LabAsistan("ülkü", "0888888888", "ulku@gmail.com", "BIO", "lab asistan", "09.00-17.00");
        System.out.println(las1.getAdSoyad());
        las1.giris();
        las1.lablaraGir();
        BilgiIslem b1 = new BilgiIslem("sığır", "01111111111", "sigir@gmail.com", "Öğrenci İşleri", "09.00-17.00", "öğrenci kaydı");
        System.out.println(b1.getAdSoyad());
        b1.giris();
        b1.networkKurulum();
        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Yakışıklı Güvenlik", "02222222222", "yakisikli_guvenlik@gmail.com", "Fen Bilimleri", "09.00-17.00", "yakın dövüş belgesi");
        System.out.println(g1.getAdSoyad());
        g1.giris();
        g1.nobet();


    }
}
