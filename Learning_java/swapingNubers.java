public class swapingNubers{
 public static void main(String[] args){
    // swaping using variable
    int number1=20;
    int number2=80;
    System.out.printf("Before swaping:number1 = %2d number2= %2d%n",number1,number2);
    int temp;
    temp=number1;
    number1=number2;
    number2=temp;
    System.out.printf("After swaping: number1= %2d  number2= %2d%n",number1,number2);
    // swaping wihtout variable
    int num1=10;
    int num2=25;

    System.out.printf("Before swaping: num1= %2d num2= %2d%n",num1,num2);
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    System.out.printf("After swaping: num1= %2d num2= %2d%n",num1,num2);
 }
}