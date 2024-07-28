import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("program başladı ");
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 20;
        int c;
        try {
            System.out.println("bölme işlemi başladı");
            System.out.println(b/a);
            System.out.println("bölme işlemi bitti");
            System.out.print("bir sayı giriniz : ");
            c=input.nextInt();
        }catch (ArithmeticException e) {
            System.out.println("aritmatik hata alındı");
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println("yanlış veri girildi");
            System.out.println(e);
        }
        System.out.println("program bitti");
    }
}
