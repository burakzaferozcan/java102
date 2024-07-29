import java.util.*;

public class PatikaStore {
    private List<Marka> markalar;
    private List<Urun> urunler;

    public PatikaStore() {
        markalar = new ArrayList<>();
        urunler = new ArrayList<>();
        markalariEkle();
    }

    private void markalariEkle() {
        markalar.add(new Marka(1, "Samsung"));
        markalar.add(new Marka(2, "Lenovo"));
        markalar.add(new Marka(3, "Apple"));
        markalar.add(new Marka(4, "Huawei"));
        markalar.add(new Marka(5, "Casper"));
        markalar.add(new Marka(6, "Asus"));
        markalar.add(new Marka(7, "HP"));
        markalar.add(new Marka(8, "Xiaomi"));
        markalar.add(new Marka(9, "Monster"));
        Collections.sort(markalar);
    }

    public List<Marka> getMarkalar() {
        return markalar;
    }

    public void markaListele() {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Marka marka : markalar) {
            System.out.println("- " + marka.getName());
        }
    }

    public void urunEkle(Urun urun) {
        urunler.add(urun);
    }

    public void urunListele(Class<?> urunTuru) {
        System.out.println(urunTuru.getSimpleName() + " Listesi");

        if (urunTuru == Notebook.class) {
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.format("| %-2s | %-30s | %-8s | %-8s | %-8s | %-8s | %-8s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
            System.out.println("----------------------------------------------------------------------------------------------------");
            for (Urun urun : urunler) {
                if (urunTuru.isInstance(urun)) {
                    Notebook notebook = (Notebook) urun;
                    System.out.format("| %-2d | %-30s | %-8.2f TL | %-8s | %-8d | %-8.1f | %-8d |\n",
                            notebook.getId(), notebook.getAd(), notebook.getFiyat(), notebook.getMarka().getName(),
                            notebook.getDepolama(), notebook.getEkranBoyutu(), notebook.getRam());
                }
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        } else if (urunTuru == CepTelefonu.class) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            System.out.format("| %-2s | %-30s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            for (Urun urun : urunler) {
                if (urunTuru.isInstance(urun)) {
                    CepTelefonu cepTelefonu = (CepTelefonu) urun;
                    System.out.format("| %-2d | %-30s | %-8.2f TL | %-8s | %-8d | %-8.1f | %-8d | %-8.1f | %-8d | %-8s |\n",
                            cepTelefonu.getId(), cepTelefonu.getAd(), cepTelefonu.getFiyat(), cepTelefonu.getMarka().getName(),
                            cepTelefonu.getHafiza(), cepTelefonu.getEkranBoyutu(), cepTelefonu.getPilGucu(), cepTelefonu.getRam(), cepTelefonu.getRenk());
                }
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public void urunSil(int id) {
        urunler.removeIf(urun -> urun.getId() == id);
    }

    public void urunFiltrele(int id) {
        for (Urun urun : urunler) {
            if (urun.getId() == id) {
                System.out.println(urun);
            }
        }
    }

    public void urunFiltrele(String markaAdi) {
        for (Urun urun : urunler) {
            if (urun.getMarka().getName().equalsIgnoreCase(markaAdi)) {
                System.out.println(urun);
            }
        }
    }
}
