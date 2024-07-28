import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("program başladı ");
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 20;
        int c;
        int[] arr = new int[2];
        try {
            System.out.println("bölme işlemi başladı");
            System.out.println(b / a);
            System.out.println("bölme işlemi bitti");
            System.out.print("bir sayı giriniz : ");
            c = input.nextInt();
            arr[12] = 11;
        } catch (ArithmeticException e) {
            System.out.println("aritmatik hata alındı");
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("yanlış veri girildi");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array hatası alındı");
        } finally {
            System.out.println("bu kısım kesinlikle çalışacak (finally)");
        }
        System.out.println("program bitti");
    }
}
