package HomeWork;
import java.util.Scanner;

public class UpareOrLowerCase {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String letter;
        System.out.println("Enter the letter to check wether uper or lower case:");
        letter =input.nextLine();
        if (letter.length()==1) {
            char ch=letter.charAt(0);
            int asciValue=(int)ch;
           if (asciValue>=65 && asciValue<=90) {
            System.out.println("You entered capital letter: "+ ch);
            
           }
           else if (asciValue>=97 && asciValue<=122) {
            System.out.println("You entered small letter: "+ ch);
            
           }
           else{
            System.out.println("It is niether capital nor small: because you entered "+ ch);
            
           }
        }


    }
}
