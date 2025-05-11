import java.util.Scanner;
class Account{
    private long accNo;
    private float balance;
    String name;

long getAccNo(){return accNo;}
float getBalace(){return balance;}
void setAccno(long accNo){this.accNo=accNo;}
void setBalance(float balance){this.balance=balance;}
boolean authenticate(){
    if(getAccNo()==10002334&&name=="Tade")return true;
    return true;

}
void displayInfo(){
    System.out.println("Name: "+name+" AccountNumber: "+getAccNo()+" Balance: "+getBalace());
}
}
public class Banking {
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Eter Name: ");
   String name=sc.nextLine();
   System.out.print("\nEnter Amount: ");
   float ammount=sc.nextFloat();
   System.out.print("\nAccount Number: ");
   long acc=sc.nextLong();
   Account acc1=new Account();
   acc1.name=name;
   acc1.setAccno(acc);
   acc1.setBalance(ammount);

   acc1.displayInfo();
   if(acc1.authenticate())System.out.println("You are authenticated for using bank:");
   else System.out.println("Authentifiacation failed");

}}
