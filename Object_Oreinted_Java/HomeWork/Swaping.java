package HomeWork;
import java.util.Scanner;
public class Swaping {

    
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the numbers to swap: ");
    int n1=input.nextInt();
    System.out.println("Enter the numbers to swap: ");
    int n2=input.nextInt();
    System.out.println("without variable");
    // --------------------------------------------------------------------------------------
    System.out.println("Before swaping number1=" + n1+"  number2= "+n2);
    n1=n1+n2;
    n2=n1-n2;
    n1=n1-n2;
    System.out.println("After swaping number1=" + n1+"  number2= "+n2);
    // -----------------------------------------------------------------------------------------
    System.out.println("with  variable");
    
    System.out.println("Before swaping number1=" + n1+"  number2= "+n2);
    int n3=n1;
    n1=n2;
    n2=n3;
    
    System.out.println("After swaping number1=" + n1+"  number2= "+n2);
    
    input.close();
    

    }
    
}
