import java.sql.*;

public class try1 {
   static final String DB_URL = "jdbc:mysql://localhost/db1?characterEncoding=utf8";
   static final String USER = "root";
   static final String PASS = "changeme";
   static final String QUERY = "SELECT Sid, Name, Salary, Age FROM sailor";

   public static void main(String[] args) throws ClassNotFoundException {
      Class.forName("com.mysql.jdbc.Driver");
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            //System.out.println(rs);
            
            System.out.print("ID: " + rs.getString("Sid"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", Name: " + rs.getString("Name"));
            System.out.println(", Salary: " + rs.getInt("Salary"));
            
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
