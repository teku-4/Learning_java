import java.util.Scanner;
public class IntigerFractionSeparator {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a action number: ");
        float Float=input.nextFloat();
        int Int=(int)Float;
        float fraction=Float-Int;
        System.out.printf("Intiger part: %2d  Fraction part: %.2f%n",Int,fraction);
        input.close();
        
    }
}
