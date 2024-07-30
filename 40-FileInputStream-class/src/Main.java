import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("patika.txt");
            FileInputStream input2 = new FileInputStream("patika.txt");

            System.out.println("kullanılabilir byte sayısı : "+input.available());
            System.out.println("------------------");
            int i=input.read();
            while(input.read()!=-1){
                System.out.print((char)i);
                i=input.read();
            }
            System.out.println();
            System.out.println();
            System.out.println("------------------");
            System.out.println();
            System.out.println("kullanılabilir byte sayısı : "+input.available());

            //todo skip(); girilen sayıda karakteri atlar
            input2.skip(5);
            while(input2.read()!=-1){
                System.out.print((char)i);
                i=input2.read();
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
