import java.util.Scanner;
class Person{
    private String password;
    String name;
    String getPassword(){
        return this.password;
    }
    void  setPassword(String passw){
        this.password=passw;
       
    }
    void displayInfo(){
        System.out.println("Name: "+this.name+" Password: "+getPassword());
    }
}
public class Setter_getter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Person persn1=new Person();
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("\nEnter password: ");
        String password=sc.nextLine();
        persn1.setPassword(password);
        persn1.name=name;
        persn1.displayInfo();
        
        
    }
    
}
