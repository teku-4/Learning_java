import java.util.Scanner;
class EmpImfo{
    String name;
    String Email;
    int ID;
    double salary;
    public void displayInfo(String name,int id,double salary,String email) {
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Email: "+email);
    System.out.println("Salary: "+salary);
    
    } 
}
 
 public class DisplayingEInfo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        EmpImfo emp1=new EmpImfo();
        int id;
        String name;
        double salary;
        String email;
        System.out.print("Name: ");
        name=sc.nextLine();

        System.out.print("\nEmail: ");
        email=sc.nextLine();
        System.out.print("\nID: ");
        id=sc.nextInt();
        System.out.print("\nSalary: ");
        salary=sc.nextFloat();
        emp1.displayInfo(name, id, salary, email);
        
    
    
    
    }
    
}
