import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        File dosya = new File("patika.txt");
//todo     DOSYA OLUŞTURMA

//        try {
//            if (dosya.createNewFile()) {
//                System.out.println(dosya.getName() + " dosyası oluşturuldu");
//            } else {
//                System.out.println(dosya.getName() + " dosyası zaten mevcut");
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//todo------------------------------------------------------------------------------------------

        //todo DOSYA SİLME
//        dosya.delete();

//todo------------------------------------------------------------------------------------------

        //TODO   KLASÖR OLUŞTURMA
//        File dizin = new File("dizin");
//        dizin.mkdir();
//        File dosya2 = new File("dizin/patika.txt");
//        try {
//            dosya2.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //TODO BİRDEN FAZLA DİZİN OLUŞTURMA

//        File dizin2 = new File("dizin1/dizin2");
//        dizin2.mkdirs();


        //TODO DİZİNDEKİ KLASÖRLERİ VE DOSYALARI LİSTELEME
        File listele = new File("39-File-class");
        listele.mkdir();
        String[] fileListele = listele.list();

            for (String file : fileListele) {
                System.out.println(file);
            }
    }
}
