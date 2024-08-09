import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static final String DB_URL="jdbc:mysql://localhost:3306/university";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD="123";

    public static void main(String[] args) {
        Connection connect=null;
        try {
            connect= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("bağlandı");
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("bağlanamadı");
        }
    }
}
