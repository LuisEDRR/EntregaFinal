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
    //ID 
    public void setId(int id){
        this.id= id;    
    }
    public int getId(){
        return id;
    }
    //FIRST NAME
    public void setfirstName(String firstName){
        this.firstName= firstName;
    }
    public String getfirstName(){
        return firstName;
    }
    //LAST NAME
    public void setlastName(String lastName){
        this.lastName= lastName;
    }
    public String getlastName(){
        return lastName;
    }
    //AGE
     public void setAge(int age){
         if (age>=18 && age<65){
             this.age= age;
         }else{
             System.err.println("Edad Invalida");
         }
            
    }
    public int getAge(){
        return age;
    }
    //EMAIL
    public void setEmail(String email){
        this.email= email;
    }
    public String getEmail(){
        return email;
    }
    //PHONENUMBER
     public void setphoneNumber(int phoneNumber){
        this.phoneNumber= phoneNumber;    
    }
    public int getphoneNumber(){
        return phoneNumber;
    }
    //SALARY
    public void setSalary(double salary){
        this.salary= salary;    
    }
    public double getSalary(){
        return salary;
    }
    //HIREDATE
     public void sethireDate(String hiredate){
        this.hiredate= hiredate;
    }
    public String gethireDate(){
        return hiredate;
    }
    
  

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
   