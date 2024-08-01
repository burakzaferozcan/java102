import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car("Mercedes","CLA200");
      try {
           ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("araba.txt"));
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
        try {
            FileInputStream input=new FileInputStream("araba.txt");
            ObjectInputStream inputStream=new ObjectInputStream(input);
            Car c2=(Car)inputStream.readObject();
            System.out.println(c2.getBrand());
            System.out.println(c2.getModel());

            input.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
