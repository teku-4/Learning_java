package HomeWork;
import java.util.Scanner;
public class Nubercheck {
public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number to check weather positive or negative;");
    int number=input.nextInt();
    if (number>0) {
        System.out.println("Positive number:");
        
    }
    
    else if (number<0) {
        System.out.println("Negative number:");
        
    }
    
    else  {
        System.out.println("number is  Zero:");
        
    }
}
}
