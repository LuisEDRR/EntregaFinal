/*
ALAN DANIEL SEVILLA HERNANDEZ
2022525
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    
    
    public static void main(String [] args){
        
        //REQUERIMIENTOS
        String driver = "com.mysql.jdbc.Driver";
        
        
        
        //URL (CADENA DE CONEXION)
        String url = "jdbc:mysql://localhost:3306/rh"; //ip: 198.201.33.05
        
        try{
            Class.forName(driver);
            System.out.println("Conexion Exitosa");
            
        }catch(Exception e){
            System.err.println("Error de conexion!!!" + e.getMessage());
            return;
        }
        
        try{
            Connection cn = DriverManager.getConnection(url, "root", "root");
            System.out.println("Conectado a la base de datos");
            System.out.println("----------------------");
            
            String sql = "select * from employee";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           /* while(rs.next()){
                
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println(rs.getInt(5));
                System.out.println(rs.getString(6));
                System.out.println(rs.getDouble(7));
                System.out.println(rs.getString(8));
                System.out.println("----------------------");
    
            }
            */
           while(rs.next()){
                
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("FirstName"));
                System.out.println(rs.getString("LastName"));
                System.out.println(rs.getInt("Age"));
                System.out.println(rs.getInt("phonenumber"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getDouble("salary"));
                System.out.println(rs.getString("hiredate"));
                System.out.println("----------------------");
    
            }
           
           
           
           
            
        }catch(Exception e){
            System.err.println("Sin Conexion a la base de datos");
            return;
        }
    }

}