package HomeWork;
import java.util.Scanner;
public class AreaCalculator {
    static void menu(){
        
    System.out.println("press 1 to calculate rectangle area:");
     
    System.out.println("press 2 to calculate triangle area:");
    
    System.out.println("press 3 to calculate circle area:");
    
    System.out.println("press 0 to exit:");
    }
    static void calculateReactangleArea(double length,double width){
        double area=length *width;
        System.out.printf("Area = %.2f%n unit square\n",area);

    }
    static void calculateTriangleArea(double base,double height){
        double area=base *height;
        System.out.printf("Area = %.2f%n unit square\n",area);

    }
    static void calculateCircleArea(double raduis){
        double area=raduis*raduis*Math.PI;
        System.out.printf("Area = %.2f%n unit \n",area);

    }
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
while(true){
    menu();
    int choice;
    System.out.println("enter your choice ");
    choice=input.nextInt();
    if (choice==0) {
        System.out.println("Goodbye!!!");
        break;
        
    }
    switch(choice){
        case 1:
        System.out.println("Enter the length: ");
        int length=input.nextInt();

        System.out.println("Enter the width: ");
        int width=input.nextInt();
        calculateReactangleArea(length, width);
        break;
        case 2:
        System.out.println("Enter the height: ");
        int height=input.nextInt();

        System.out.println("Enter the base: ");
        int base=input.nextInt();
        calculateTriangleArea(base, height);
        break;
        case 3:
        System.out.println("Enter the raduis: ");
        int raduis=input.nextInt();
        calculateCircleArea(raduis);
        break;
        default:
        System.out.println("wrong input");

    }                   
}
}
}