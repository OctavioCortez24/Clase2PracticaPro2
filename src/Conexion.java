import java.sql.*;

public class Conexion {
    static Conexion conexion;
    static Conexion getInstance(){
        if (conexion==null){
            return  conexion=new Conexion();
        }else {
            return conexion;
        }
    }

    public void crearConxion(){
        try{
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
            PreparedStatement prepared = conn.prepareStatement("Select* from alumno;");
            ResultSet resultSet= prepared.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("Nombre")+" "+resultSet.getString("Apellido"));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
