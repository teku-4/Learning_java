import java.util.Scanner;
public class averageCalculators {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        float mark1,mark2,mark3,average;
        System.out.println("Enter the mark1:");
        mark1=input.nextFloat();
        
        System.out.println("Enter the mark2:");
        mark2=input.nextFloat();
        
        System.out.println("Enter the mark3:");
        mark3=input.nextFloat();
        average=(mark1+mark2+mark3)/3;
        System.out.printf("the average is: %.2f%n",average);
        input.close();

    }
}
