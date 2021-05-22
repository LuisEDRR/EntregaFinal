/*
LUIS EDUARDO RAMIREZ RIVAS 2022793
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
 Connection con;
 
 public conexion(){
     
     String driver = "com.mysql.jdbc.Driver";
     String url = "jdbc:mysql://localhost:3306/hr";
     
     try{
         Class.forName(driver);
         con = DriverManager.getConnection(url, "root", "root");
     }catch (Exception e){
         
     }
 }
 
 public Connection getConnection(){
     
     return con;
     
 }
    
    
    /*
    public static void main(String[] args) {
        
        
        
        
        
 //requerimientos
        //1.-REQUERIMIENTOS:
        String driver = "com.mysql.jdbc.Driver";
        // 2.- URL (cadena de conexión
        String url = "jdbc:mysql://localhost:3306/hr";

        try {

            Class.forName(driver);
            System.out.println("Conexion Exitosa");

        } catch (Exception e) {
            System.err.println("Error de Conexion !!" + e.getMessage());
            return;
        }

        try { 
            Connection cn = DriverManager.getConnection(url, "root", "root");
            System.out.println("Conectado a la Base de DATOS");

            System.out.println("----------------------------------------");

            String sql = "select * from employee";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getInt(6));
                System.out.println(rs.getDouble(7));
                System.out.println(rs.getString(8));
                System.out.println("-----------------------------------");

            }

        } catch (Exception e) {
            System.err.println("Sin conexion a la Base de Datos" + e.getMessage());
            return;
        }

    }
*/
}