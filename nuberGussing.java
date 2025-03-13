import java.util.Scanner;
import java.util.Random;

public class nuberGussing {
    public static void main(String[] args){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int rand=random.nextInt(1,11);
        int count=0;
       while(true){
        System.out.println("Enter your guess");
        int guess=input.nextInt();
        count++;
        if (guess>rand) {
            System.out.println("Your guess is too hiegh");
            
        }
        else if(guess<rand){
            System.out.println("your gues is too low pleas try again");
        }
        else if(guess==rand){
            System.out.println("Congratulation!  You got it Exactly after "+ count + "tries!");
         break;
        }
     
       }
       input.close();
    }
    
}
