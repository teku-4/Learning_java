import java.util.Scanner;
class Reverse{
    int arr[];
    int size;

Reverse(int s){
    this.size=s;
    this.arr=new int[size];
    Scanner input=new Scanner(System.in);
    for(int i=0;i<size;i++){
        System.out.println("Enter Element "+(i+1)+"  ");
        arr[i]=input.nextInt();
    }

}
public  void reverse(){
    for(int i=size-1;i>=0;i--){
        System.out.print(arr[i]+" ");
      }
    
}
public void swapFristTolast(){
    for(int i=0;i<size;i++){
        arr[0]=arr[size-1]+arr[0];
        arr[size-1]=arr[0]-arr[size-1];
        arr[0]=arr[0]-arr[size-1];
    }
    for(int n:arr){
        System.out.print(n+"  ");
    }

}
}

public class ArrayRevesing {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int size;
        System.out.println("Enter the size: ");
        size=input.nextInt();
        Reverse ob1=new Reverse(size);
        ob1.reverse();
        System.out.println();
        ob1.swapFristTolast();

    }
    
}
