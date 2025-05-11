package LAB_EXERCISE;
import java.util.Scanner;

public class AddDigit {
   public AddDigit() {
   }

   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int digit=0;
      int count=0;
      int sumDigit=0;
      System.out.println("Ente the number the number betwen 0 and 1000");
       int number=input.nextInt();
       if (number <=1000 && number>0) {
        int original=number;
        while(number>0){
            digit=number%10;
            sumDigit+=digit;
            count++;
            number/=10;
        }
        System.out.println("the sum of (" + count + ") digit of this (" + original + ") numbers are " + sumDigit);
       }
      
   }
}

    
