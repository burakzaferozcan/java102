import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws Exception {
        if(age < 18){
            throw new Exception("Yaşınız tutmuyor");
        }
        System.out.println("yaşı uygundur");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("program başladı");
        System.out.print("yaşınızı giriniz : ");
        int age=input.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("yaşı uymadı");
        }
        System.out.println("program bitti");

    }
}
