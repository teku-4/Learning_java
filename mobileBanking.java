package methode;
import java.util.Scanner;

 class BankingOpration{
    static Scanner input=new Scanner(System.in);
    private double balance;
    int account;
    private  int pin;
    BankingOpration(double balance,int account,int pin){
        this.balance=balance;
        this.account=account;
        this.pin=pin;
    }
    int getPin(){
        return this.pin;
    }
    double getBalace(){
        return this.balance;
    }
    boolean authenticate(){
        int pin;
        int account;
        System.out.print("Enter your pin: ");
        pin=input.nextInt();

        System.out.print("\nEnter your acount number:   ");
        account=input.nextInt();
        
        if(getPin()==pin && this.account==account){
          return true;

        }
        else{
            return false;
        }
    }
    static void menu(){
        
        System.out.println("*************************************************\n ");
        System.out.println("\t1) to withdraw ");
        
        System.out.println("\t2) to deposite ");
        
        System.out.println("\t3) to check balance");
        
        System.out.println("\t4 ) to transfer");
        
        System.out.println("\t0) to exite");
        
        System.out.println("______________________________________________________");
    }
    void withdraw(){
        double amount;
        System.out.print("Enter your amount:  ");
        amount=input.nextFloat();
        if(amount<0){
            System.out.println("\nAmmount must be positive");

        }
        else if(amount>getBalace()-100){
            System.out.println("You have insufficienct balance to withdraw this "+amount +" amount");

        }
        else if(amount<=getBalace()-100){
            double remain=getBalace()-amount;
            System.out.printf("you withdraw %.2f%n succesfullY!!",amount);
            System.out.printf("your remain amount is %.2f%n ",remain);
        }
        
        }
        void deposite(){
            double amount ;
            System.out.print("Enter amount");
            amount=input.nextFloat();
            if(amount>0){
                double total=amount+getBalace();
                System.out.printf("you deposite %.2f%n succesfullY!!",amount);
                System.out.printf("you total amount is %.2f%n",total);
            
            
            }
            else{
                System.out.printf("amount must be positive ");
            }}
            double checkBalance(){
                return getBalace();

            }
            void transfer(){
                int userAcount;
                String username;
                System.out.print("Enter the username you want to transfer:  ");
                username=input.nextLine();
                System.out.print("\nuser account number:  ");
                
                userAcount=input.nextInt();
                if (userAcount==10001212 && username=="Abel kebede") {
                    double amount;
                    System.out.print("\nEnter your amount:  ");
                    amount=input.nextFloat();
                    if(amount>0 && amount<=getBalace()-100){
                        double remain=getBalace()-amount;
                        System.out.printf("\n you transfer %.2f%n amount succesfully!!",amount);
                        System.out.printf("Your remaining ammount is %.2f%n ",remain);
                    }
                     else if (amount > getBalace()-100){
                        System.out.println("You have insufficient balance to transfer");

                     }
                     else{
                        System.out.println("amount must be positive");
                     }
                 
                }}}

    

public class MobileBanking {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        BankingOpration mb1=new BankingOpration(10000.0,10001414,1234);
        
        while(true){
            int option;
            mb1.menu();

            System.out.print("Enter your optin from the above menu: ");
            option=input.nextInt();
            if(option==0){
                System.out.println("\n Goodbye!!! have a nice time");
                break;}
              switch (option) {
                case 1:
                if(mb1.authenticate()){
                    mb1.withdraw();
                }
                    
                   break;
                   case 2:
                   if(mb1.authenticate()){
                    mb1.deposite();
                   }
                   break;
                   case 3:
                   if (mb1.authenticate()) {
                   System.out.println("your current available amount is "+ mb1.checkBalance());
                    
                   }
                   break;
                   case 4:
                   if (mb1.authenticate()) {
                    mb1.transfer();
                    
                   }
                   break;
                    default:
                    System.out.println("Invalid input");
                   }  
                  }
        }

    }
    
