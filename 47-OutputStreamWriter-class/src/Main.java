import javax.imageio.stream.FileImageOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        String data="ĞÜŞİ";
        try {
            FileOutputStream fileOutput=new FileOutputStream("output.txt");
            FileOutputStream fileOutput2=new FileOutputStream("output2.txt");
            FileOutputStream fileOutput3=new FileOutputStream("output3.txt");
            FileOutputStream fileOutput44=new FileOutputStream("output4.txt");
            OutputStreamWriter fileWriter=new OutputStreamWriter(fileOutput3);
            OutputStreamWriter fileWriter2=new OutputStreamWriter(fileOutput44,Charset.forName("Big5"));
            fileOutput.write(data.getBytes());
            fileOutput2.write(data.getBytes(Charset.forName("Big5")));
            fileWriter.write(data);
            System.out.println(fileWriter.getEncoding());
            fileWriter2.write(data);
            System.out.println(fileWriter2.getEncoding());
            fileOutput.close();
            fileOutput2.close();
            fileWriter.close();
            fileWriter2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
