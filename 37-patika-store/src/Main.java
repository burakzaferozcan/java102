import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatikaStore store = new PatikaStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    notebookIslemleri(store, scanner);
                    break;
                case 2:
                    cepTelefonuIslemleri(store, scanner);
                    break;
                case 3:
                    store.markaListele();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }

    private static void notebookIslemleri(PatikaStore store, Scanner scanner) {
        System.out.println("Notebook İşlemleri");
        System.out.println("1 - Notebook Listele");
        System.out.println("2 - Notebook Ekle");
        System.out.println("3 - Notebook Sil");
        System.out.print("Tercihiniz : ");

        int secim = scanner.nextInt();
        scanner.nextLine();

        switch (secim) {
            case 1:
                store.urunListele(Notebook.class);
                break;
            case 2:
                urunEkle(store, scanner, Notebook.class);
                break;
            case 3:
                urunSil(store, scanner);
                break;
            default:
                System.out.println("Geçersiz seçim!");
        }
    }

    private static void cepTelefonuIslemleri(PatikaStore store, Scanner scanner) {
        System.out.println("Cep Telefonu İşlemleri");
        System.out.println("1 - Cep Telefonu Listele");
        System.out.println("2 - Cep Telefonu Ekle");
        System.out.println("3 - Cep Telefonu Sil");
        System.out.print("Tercihiniz : ");

        int secim = scanner.nextInt();
        scanner.nextLine();

        switch (secim) {
            case 1:
                store.urunListele(CepTelefonu.class);
                break;
            case 2:
                urunEkle(store, scanner, CepTelefonu.class);
                break;
            case 3:
                urunSil(store, scanner);
                break;
            default:
                System.out.println("Geçersiz seçim!");
        }
    }

    private static void urunEkle(PatikaStore store, Scanner scanner, Class<?> urunTuru) {
        System.out.print("Ürün ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürün Adı: ");
        String ad = scanner.nextLine();
        System.out.print("Fiyat: ");
        double fiyat = scanner.nextDouble();
        System.out.print("İndirim Oranı: ");
        double indirimOrani = scanner.nextDouble();
        System.out.print("Stok Miktarı: ");
        int stokMiktari = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marka Adı: ");
        String markaAdi = scanner.nextLine();
        Marka marka = store.getMarkalar().stream()
                .filter(m -> m.getName().equalsIgnoreCase(markaAdi))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Geçersiz marka!"));

        if (urunTuru == CepTelefonu.class) {
            System.out.print("Hafıza: ");
            int hafiza = scanner.nextInt();
            System.out.print("Ekran Boyutu: ");
            double ekranBoyutu = scanner.nextDouble();
            System.out.print("Pil Gücü: ");
            int pilGucu = scanner.nextInt();
            System.out.print("RAM: ");
            int ram = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Renk: ");
            String renk = scanner.nextLine();

            CepTelefonu telefon = new CepTelefonu(id, fiyat, indirimOrani, stokMiktari, ad, marka, hafiza, ekranBoyutu, pilGucu, ram, renk);
            store.urunEkle(telefon);
        } else if (urunTuru == Notebook.class) {
            System.out.print("Depolama: ");
            int depolama = scanner.nextInt();
            System.out.print("Ekran Boyutu: ");
            double ekranBoyutu = scanner.nextDouble();
            System.out.print("RAM: ");
            int ram = scanner.nextInt();

            Notebook notebook = new Notebook(id, fiyat, indirimOrani, stokMiktari, ad, marka, depolama, ekranBoyutu, ram);
            store.urunEkle(notebook);
        }
    }

    private static void urunSil(PatikaStore store, Scanner scanner) {
        System.out.print("Silinecek Ürün ID: ");
        int id = scanner.nextInt();
        store.urunSil(id);
    }
}
