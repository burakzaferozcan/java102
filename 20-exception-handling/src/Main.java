import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program başladı !");
        System.out.print("A sayısını giriniz : ");
        int a=input.nextInt();
        int b=10;
        if(a==0){
            System.out.println("bir sayı sıfıra bölünemez!!!");
        }else{
            System.out.println(b/a);
        }
        System.out.println("Program bitti !");


    }
}
