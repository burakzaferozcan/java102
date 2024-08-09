import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "123";

    public static void main(String[] args) {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("bağlandı");

            connect.setAutoCommit(false);
            PreparedStatement pr = connect.prepareStatement("insert into student (student_name,student_class) values (?,?)");
            pr.setString(1,"mahmut");
            pr.setInt(2,4);
            pr.executeUpdate();

            if(true){
                throw new SQLException();
            }
            pr.setString(1,"mustafa");
            pr.setInt(2,5);
            pr.executeUpdate();
            connect.commit();

            pr.close();
            connect.close();

        } catch (SQLException e) {
            e.printStackTrace();
            if (connect!=null){
                try {
                    connect.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println("bağlanamadı");
        }
    }
}
