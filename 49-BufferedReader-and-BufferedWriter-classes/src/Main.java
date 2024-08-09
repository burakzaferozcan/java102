import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("patika.txt");
            BufferedReader readBuff = new BufferedReader(readFile);
            String line = readBuff.readLine();
            while (line != null) {
                System.out.println(line);
                line = readBuff.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String data="JAVAÖĞRENİYORUM";
        try {
            FileWriter writerFile=new FileWriter("output88.txt");
            BufferedWriter writeBuff=new BufferedWriter(writerFile);
            writeBuff.write(data);
            writeBuff.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
