import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream("patika.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);
            int i = buffInput.read();
            while (i != -1) {
                System.out.print((char) i);
                i = buffInput.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String data = "java 102 patikasi";
        try {
            FileOutputStream file = new FileOutputStream("patika2.txt");
            BufferedOutputStream buffFile = new BufferedOutputStream(file);
            byte[] byteArray = data.getBytes();
            buffFile.write(byteArray);
            buffFile.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
