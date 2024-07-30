import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] dizi = {1, 2, 3, 54, 66};

        ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        System.out.println("kullanılabilen byte sayısı : " + input.available());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println("kullanılabilen byte sayısı : " + input.available());
        System.out.println("-------------------------------");
        ByteArrayInputStream input2 = new ByteArrayInputStream(dizi);
        System.out.println("kullanılabilen byte sayısı : " + input2.available());
        int i = input2.read();
        while (i != -1) {
            System.out.println(i);
            i = input2.read();

        }
        System.out.println("kullanılabilen byte sayısı : " + input2.available());


        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-------------------------------");

        String data="java 102 dersleri!";
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        byte[] dataByteArray=data.getBytes();

        try {
            output.write(dataByteArray);
            String newData=output.toString();
            System.out.println("Çıkış akışı : "+newData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
