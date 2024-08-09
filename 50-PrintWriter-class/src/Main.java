import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data="java 102";
        try {
            PrintWriter writer = new PrintWriter("output10.txt");
            writer.print(data);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
