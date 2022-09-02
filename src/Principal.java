
public class Principal {
    public static void main(String[] args) {

        String driver="com.mysql.jdbc.Driver";
       try{
           Class.forName(driver).newInstance();
       }catch (Exception e){

       }
    }
}
