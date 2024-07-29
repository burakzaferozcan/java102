public abstract class Urun {
    private int id;
    private double fiyat;
    private double indirimOrani;
    private int stokMiktari;
    private String ad;
    private Marka marka;

    public Urun(int id, double fiyat, double indirimOrani, int stokMiktari, String ad, Marka marka) {
        this.id = id;
        this.fiyat = fiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.ad = ad;
        this.marka = marka;
    }

    public int getId() {
        return id;
    }

    public double getFiyat() {
        return fiyat;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public String getAd() {
        return ad;
    }

    public Marka getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ürün Adı: " + ad + ", Fiyat: " + fiyat + ", Marka: " + marka.getName();
    }
}
