
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.mx.Employee;

public class HR_Main {
  
    
    public static void main (String[] args){
        
        //CREACION DE OBJETOS
        Employee e1 = new Employee ();
        
        Employee e2 = new Employee ();
        
        
        e1.setId(1);
        e1.setfirstName("Alfonso");
        e1.setlastName("Roberto");
        e1.setAge(18);
        e1.setEmail("alan.hdz_inc@hotmail.com");
        e1.setphoneNumber(123456789);
        e1.setSalary(5000);
        e1.sethireDate("02/02/2021");
        
       /* e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
        e2.firstName = JOptionPane.showInputDialog("Ingrese su nombre");
        e2.lastName = JOptionPane.showInputDialog("Ingrese su apellido");
        e2.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        e2.email = JOptionPane.showInputDialog("Ingrese su correo");
        e2.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono"));
        e2.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        e2.hiredate = JOptionPane.showInputDialog("Ingrese su fecha de contratacion");
       */
        e1.getDetils();
        System.out.println("-----------------------------------------");
       // e2.getDetils();
        
        
    }
    
}
