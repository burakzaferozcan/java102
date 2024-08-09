import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("patika.dev");
        try {
            PrintStream output=new PrintStream("print.txt");
            output.println(5+8);
            output.println("5"+5);
            output.println("bzo");
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
