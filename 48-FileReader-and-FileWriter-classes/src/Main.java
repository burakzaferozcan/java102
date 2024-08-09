import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile=new FileReader("patika.txt");
            FileReader readFile2=new FileReader("patika.txt", Charset.forName("Big5"));
            int i=readFile.read();
            while(i!=-1){
                System.out.print((char)i);
                i=readFile.read();
            }
            System.out.println();
            int i2=readFile2.read();
            while(i2!=-1){
                System.out.print((char)i2);
                i2=readFile2.read();
            }
            readFile.close();
            readFile2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String data="Java Öğreniyorum";
        try {
            FileWriter writerFile=new FileWriter("output8.txt");
            writerFile.write(data);
            writerFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
