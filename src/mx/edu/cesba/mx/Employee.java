package mx.edu.cesba.mx;

/**
 *
 * Alan Sevilla 
 * 2022525
 */
public class Employee {

    //CAMPOS: CARACTERISTICAS DE UN OBJETO
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public int phoneNumber;
    public String email;
    public double salary;
    public String hiredate;

    public void getDetils() { //METODO: ACCIONES QUE REALIZA UN OBJETO
        
        System.out.println("id: " +  id);
        System.out.println("FirstName: " +   firstName);
        System.out.println("LastName: " +   lastName);
        System.out.println("age: " +   age);
        System.out.println("email: "  +   email);
        System.out.println("Phone Number: " +   phoneNumber);
        System.out.println("Salary: " +   salary);
        System.out.println("Hire Date: " +   hiredate);
                

        
    }    
}