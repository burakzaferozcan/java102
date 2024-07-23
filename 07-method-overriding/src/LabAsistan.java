public class LabAsistan extends Asistan {
    public LabAsistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir() {
        System.out.println(this.getAdSoyad() + " laboratuvara girdi.");
    }

    // method overriding
    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " (method overriding) lab asistanı derse girdi.");
    }
}
