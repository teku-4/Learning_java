import java.util.Scanner;

public class Oprators {
    // ---------------------------------------------------------------------------
 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("--------welcome to java oprators tutorial------------");
        int number1,number2;
        // -----------------------------------------------------------
        // arthimetic oprators
        int sum, product, substruct,modulo;
        System.out.println("Enter the frist number: ");
        number1=input.nextInt();
        System.out.println("Enter the second number: ");
        number2=input.nextInt();
        product= number1*number2;
        sum=number1+number2;
        substruct=number1-number2;
        modulo=number1%number2;
        double qoustiont=number1/number2;
        System.out.printf("the product is: %d%n", product);
        
        System.out.printf("the sum is: %d%n", sum);
        
        System.out.printf("the substruct is: %d%n", substruct);
        
        System.out.printf("the modulo is: %d%n", modulo);
        
        System.out.printf("the qoustiont is: %f%n", qoustiont);
        // ---------------------------------------------------------
        // comparision oprators 
        System.out.println(number1 > number2);
        System.out.println(number1==number2);
        System.out.println(number1 <= number2);

        // ------------------------------------------------------------
        // logical oprators
        boolean isLightOff=false;
        boolean isRaining=true;
        System.out.println((isLightOff) && (isRaining));
        System.out.println((isRaining) || (isLightOff));
        System.out.println(!((isLightOff) || (isRaining)));






        input.close();
    }

}
