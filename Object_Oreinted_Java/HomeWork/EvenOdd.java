package HomeWork;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
           Scanner input=new Scanner(System.in);
    System.out.println("Enter the number to check weather even or odd ;");
    int number=input.nextInt();
    if (number%2==0) {
        System.out.println("Even number:");
        
    }
    
    else if (number%2==1) {
        System.out.println("Odd number:");
        
    }
    
    else  {
        System.out.println("not number:");
        
    }
}
    }
