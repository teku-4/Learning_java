
package currencyConversion;
import java.util.Scanner;
public class java {
   
   static void menu(){
        System.out.println("====== welcome to currency change================ ");
        
        System.out.println("1) to covert dollar to Birr: ");
        System.out.println("2) to covert Birr to dollar: ");
        System.out.println("3) to covert yuro to birr : ");
        System.out.println("4) to convert dollar to to yuro: ");
        System.out.println("0) to exite: ");
        System.out.println("----------------------------------------");
        
    }
    static  void convertdollartoBirr(double amount){
        double rateDollartobirr=131.0;
        double result=rateDollartobirr*amount;
        System.out.printf("$%.2f  converted to %.2f%n Birr ",amount,result);
        
        
        double dollartoyuro=0.991;
        
    }
     static void ConvertBirrtoDollar(double amount){
     double rateDollartobirr=131.0;
     double result=amount/rateDollartobirr;
     System.out.printf("%.2f Birr  converted to $%.2f%n ",amount,result);
        
    }
    static void convertYuroTobirr(double amount){
        double rateyurotoBirr=132.0;
     double result=amount*rateyurotoBirr;
     System.out.printf("Y%.2f  converted to %.2f%n Birr ",amount,result);
       
    }
    static void convertdolartoYuro(double amount){
        
        double dollartoyuro=0.991;    
        
     double result=amount/ dollartoyuro;
     System.out.printf("$%.2f  converted to %.2f%n yuro ",amount,result);
       
    }
    public static void main(String args){
        Scanner input=new Scanner(System.in);
        double amount;
        while(true){
            int chooce;
            if(chooce==0){
                System.out.println("Goodbye!!!");
                break;
            }
            menu();
            System.out.println("Enter your choice: ");
            chooce =input.nextInt();
            switch(chooce){
                case 1:
                    System.out.println("Enter  amount in birr");
                    amount=input.nextFloat();
                    convertdollartoBirr(amount);
                    break;
                case 2:
                    System.out.println("Enter  amount in dollar");
                    amount=input.nextFloat();
                   ConvertBirrtoDollar(amount);
                    break;    
                 case 3:
                    System.out.println("Enter  amount in yuro");
                    amount=input.nextFloat();
                    convertYuroTobirr(amount);
                    break;    
                 case 4:
                     
                    System.out.println("Enter  amount in dollar");
                    amount=input.nextFloat();
                    convertdolartoYuro(amount);
                    break;  
                 default:
                     System.out.println("Invalid input");
                     
                   
                   
            }
            
        }
    }

}
