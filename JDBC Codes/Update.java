import java.sql.*;

public class Update {
    static final String DB_URL = "jdbc:mysql://localhost/db1?characterEncoding=utf8";
    static final String USER = "root";
    static final String PASS = "changeme";
    // static final String QUERY = "SELECT Sid, Name, Salary, Age FROM sailor";
    static final String QUERY = "UPDATE sailor SET Name = ? WHERE sID = ?";
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = con.prepareStatement(QUERY);
            String ID = "s01";
            String Name = "Chnaged";
            ps.setString(1, Name);
            ps.setString(2, ID);

            int n = ps.executeUpdate();
            System.err.println("Updated Rows : " + n);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
