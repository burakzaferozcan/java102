public class Notebook extends Urun {
    private int depolama;
    private double ekranBoyutu;
    private int ram;

    public Notebook(int id, double fiyat, double indirimOrani, int stokMiktari, String ad, Marka marka, int depolama, double ekranBoyutu, int ram) {
        super(id, fiyat, indirimOrani, stokMiktari, ad, marka);
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public int getRam() {
        return ram;
    }
}
