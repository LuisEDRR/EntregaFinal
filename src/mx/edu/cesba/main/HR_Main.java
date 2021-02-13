
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.mx.Employee;

public class HR_Main {
  
    
    public static void main (String[] args){
        
        //CREACION DE OBJETOS
        Employee e1 = new Employee ();
        
        Employee e2 = new Employee ();
        
        
        e1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
        e1.firstName = JOptionPane.showInputDialog("Ingrese su nombre");
        e1.lastName = JOptionPane.showInputDialog("Ingrese su apellido");
        e1.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        e1.email = JOptionPane.showInputDialog("Ingrese su correo");
        e1.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono"));
        e1.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        e1.hiredate = JOptionPane.showInputDialog("Ingrese fecha de contratacion");
        
        e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
        e2.firstName = JOptionPane.showInputDialog("Ingrese su nombre");
        e2.lastName = JOptionPane.showInputDialog("Ingrese su apellido");
        e2.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        e2.email = JOptionPane.showInputDialog("Ingrese su correo");
        e2.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono"));
        e2.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        e2.hiredate = JOptionPane.showInputDialog("Ingrese su fecha de contratacion");
       
        e1.getDetils();
        System.out.println("-----------------------------------------");
        e2.getDetils();
        
        
    }
    
}
