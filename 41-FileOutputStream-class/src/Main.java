import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String yazi = "\nOutputStream ogreniyorum \nPatika Dev";
        try {
            File dosya = new File("patika.txt");
            //todo DOSYA YOKSA OLUŞTURUR VE TRUE DEĞERİ VERİRSEK OLAN DOSYAYI TEKRAR OLUŞTURMAZ
            FileOutputStream output = new FileOutputStream(dosya, true);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
