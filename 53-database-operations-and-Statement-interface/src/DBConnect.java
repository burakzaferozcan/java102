import java.sql.*;

public class DBConnect {
    public static final String DB_URL="jdbc:mysql://localhost:3306/university";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD="123";

    public static void main(String[] args) {
        Connection connect=null;
        String getSQL="select * from student";
        String postSQL="insert into student (student_name,student_class) values ('burak',4)";
        String postSQL2="insert into student (student_name,student_class) values (?,?)";
        String putSQL="update student set student_name='özcan' where student_id=6";
        String putSQL2="update student set student_name= ? where student_id= ?";
        String deleteSQL="delete from student where student_id=8";
        String deleteSQL2="delete from student where student_id= ?";



        try {
            connect= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("bağlandı");

            Statement st=connect.createStatement();
            // todo 1. post yöntemi
            // st.executeUpdate(postSQL);

            // todo 2. post yöntemi
            // PreparedStatement prSt=connect.prepareStatement(postSQL2);
            // prSt.setString(1,"zafer");
            // prSt.setInt(2,1);
            // prSt.executeUpdate();
            // prSt.close();

            // todo 1. put yöntemi
            // st.executeUpdate(putSQL);

            // todo 2. put yöntemi
            // PreparedStatement prSt=connect.prepareStatement(putSQL2);
            // prSt.setString(1,"özcan");
            // prSt.setInt(2,6);
            // prSt.executeUpdate();
            // prSt.close();

            // todo 1. delete yöntemi
            // st.executeUpdate(deleteSQL);

            // todo 2. delete yöntemi
            // PreparedStatement prSt=connect.prepareStatement(deleteSQL2);
            // prSt.setInt(1,8);
            // prSt.executeUpdate();
            // prSt.close();


            //todo get yöntemi
            ResultSet data=st.executeQuery(getSQL);

            while(data.next()){
                int id1=data.getInt(1);
                String name1=data.getString(2);
                int class1=data.getInt(3);
                int id2=data.getInt("student_id");
                String name2=data.getString("student_name");
                int class2=data.getInt("student_class");
                System.out.println("ID : "+id2+" | İsim : "+name2+" | Sınıf : "+class2);
            }

            st.close();

        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("bağlanamadı");
        }
    }
}
