package mx.edu.cesba.mx;

/**
 *
 * Alan Sevilla 
 * 2022525
 */
public class Employee {

    //CAMPOS: CARACTERISTICAS DE UN OBJETO
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int phoneNumber;
    private String email;
    private double salary;
    private String hiredate;
    
    //METODOS PARA ACCEDER A PRIVATE USANDO GET y SET
  
  

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
   