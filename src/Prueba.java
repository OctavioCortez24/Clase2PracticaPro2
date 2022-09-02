import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.*;

public class Prueba {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "1234");
           //Select
            /*PreparedStatement prepared = conn.prepareStatement("Select* from alumno;");
          ResultSet resultSet= prepared.executeQuery();
          while (resultSet.next()){
              System.out.println(resultSet.getString("Nombre")+" "+resultSet.getString("Apellido"));
          }*/

            //Insert
          PreparedStatement pSInsert=conn.prepareStatement("INSERT INTO clientes VALUES(?,?,?,?,?,?,?)");
          pSInsert.setInt(1,3);
          pSInsert.setString(2,"37");
          pSInsert.setString(3,"53423456@gmail.com");
          pSInsert.setString(4,"C");
          pSInsert.setInt(5,2);
          pSInsert.setInt(6,3);
          pSInsert.setInt(7,9);
          pSInsert.executeUpdate();

          //Update
            //Modifico un alumno y lo guardo ------------------------------------------------------------------
            Statement st=conn.createStatement();
            String query="UPDATE alumno SET Apellido='Castro'WHERE Dni=43213252";
            st.execute(query);// Ya se modifico el alumno

            conn.close();
            //pSInsert.close();
           // pSUpdate.close();
            //st.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
