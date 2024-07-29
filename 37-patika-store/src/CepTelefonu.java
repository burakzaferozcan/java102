public class CepTelefonu extends Urun {
    private int hafiza;  // GB
    private double ekranBoyutu;  // İnç
    private int pilGucu;  // mAh
    private int ram;  // GB
    private String renk;

    public CepTelefonu(int id, double fiyat, double indirimOrani, int stokMiktari, String ad, Marka marka, int hafiza, double ekranBoyutu, int pilGucu, int ram, String renk) {
        super(id, fiyat, indirimOrani, stokMiktari, ad, marka);
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public int getHafiza() {
        return hafiza;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public int getPilGucu() {
        return pilGucu;
    }

    public int getRam() {
        return ram;
    }

    public String getRenk() {
        return renk;
    }
}
