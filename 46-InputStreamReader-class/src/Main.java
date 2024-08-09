import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput=new FileInputStream("patika.txt");
            InputStreamReader inputReader=new InputStreamReader(fileInput);
            InputStreamReader inputReader2=new InputStreamReader(fileInput, Charset.forName("UTF-8"));

            System.out.println(inputReader.getEncoding());
            int i= inputReader.read();

            while(i!=-1){
                System.out.print((char)i);
                i=inputReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
