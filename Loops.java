import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
    //  ------------------------------------------------------------------------
    Scanner input=new Scanner(System.in);
    // --------------------------while loop-----------------------------------------
    // random choicing game----------------------------------------------
    // int randomChance,guess;
    // randomChance=(int)(Math.random()*11);
  
    // int count=0;
    // while (count <= 4)
    // {
    // System.out.println("Please try your chance! ");
    // guess=input.nextInt();
    // count++;
    // if(guess < randomChance){
    //     System.out.println("your try is too low reapeat!");
    // } 
    // else if(guess > randomChance)
    // {
    //     System.out.println("your try is too high reapeat! ");
    // }
    // else if(guess==randomChance){
    //     System.out.println("congratulation you go exactly after " + count + " trying");
    //     break;
    // }
    // else{
    //     System.out.println("your input is out of the range enter the correct input ");

    // }
    // }
    // -------------------do while---------------------------------------------
    // count dow
    // int num=10;
    // do{
    //     System.out.println("count: "+ num);
    //     num--;
    // }
    // while(num>=1);

    // ----------------------for loop----------------------------------------------------
    // calculate factorial
    // int n=8;
    //  int fact=1;
    // for (int i=1; i<=n; i++){
    //     fact*=i;
    // }
    // System.out.printf("%d%n!= %d%n",n,fact);

    // nested loop to print multiplication date------------------------
    int n=6;
    
    System.out.println("---Multiplication Tbale---");
    System.out.println("___________________________");
    for (int a=1; a<=n; a++)
    
    {
        System.out.printf(" "+"%4d",a);
    }
    System.out.println();
    System.out.println("-----------------------------");
    
    for (int i=1; i<=n; i++){
        System.out.printf("%2d |",i);
        for(int j=1; j<=n; j++){
            System.out.printf("%4d",i*j);
        }
        System.out.println();
    }
    input.close();
    }
}
