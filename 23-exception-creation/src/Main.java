import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if(age < 18){
            throw new AgeCheckException("hata yakalandı");
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
        }catch (AgeCheckException e){
            System.out.println("yaşı uymadı");
            System.out.println(e.getMessage());
        }
        System.out.println("program bitti");

    }
}
