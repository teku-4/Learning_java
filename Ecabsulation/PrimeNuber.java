import java.util.Scanner;
class Prime{
    private int num;
    
    void setPrime(int num){
        this.num=num;
    }
  boolean isPrime(){
    int count=0;
    if(num<=0) return false;
    else{
        for(int i=1;i<=num;i++){
            if(num%i==0)count++;
            if(count>2)break;
        }
        return (count==2);


    }}
  }

public class PrimeNuber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Prime num1=new Prime();
     
        System.out.println("Enter number");
        int num=sc.nextInt();
        num1.setPrime(num);
    System.out.println((num1.isPrime())?"Prime number":"Not Numt prime");
}
}

