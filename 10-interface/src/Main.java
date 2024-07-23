import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tutar giriniz : ");
        double price = input.nextDouble();
        System.out.println("Kart no giriniz : ");
        String cardNumber = input.next();
        System.out.println("Son kullanım tarihi giriniz : ");
        String date = input.next();
        System.out.println("güvenlik kodu giriniz : ");
        String cvc = input.next();
        System.out.println("1. A bankası ");
        System.out.println("2. B bankası ");
        System.out.println("3. C bankası ");
        System.out.print("Banka seçiniz :  ");
        int selectBank = input.nextInt();
        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankası", "32165534", "4523");
                aPos.connect("xxx");
                aPos.payment(price, cardNumber, date, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası", "986453", "9821");
                bPos.connect("yyy");
                bPos.payment(price, cardNumber, date, cvc);
                break;
            default:
                System.out.println("geçerli banka seçiniz!");

        }


    }
}
