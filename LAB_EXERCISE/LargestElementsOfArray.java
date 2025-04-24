package LAB_EXERCISE;
import java.util.Scanner;
public class LargestElementsOfArray{
    
    public static void main(String args[]){
         Scanner input =new Scanner(System.in);
         int len; 
        System.out.println("How many numbers  do you want to enter? ");
        len=input.nextInt();
        // --------------------------------------------------------------------------------------
        int numbers[]=new int[len];
        int count=0;
        // --------------------------------------------------------------------------------------
        for (int i=0;i<len;i++) {
            System.out.print("Enter elment: "+(i+1)+"\t");
            numbers[count++]=input.nextInt();
            
        }
        // -------------------------------------------------------------------------------------------------
         System.out.println("\n the original array is:");
        
        for (int n:numbers) {
            System.out.print(n+" ");
            
        }
        // -----------------------------------------------------------------------------------------------
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++)
            if (numbers[i]<numbers[j]) {
                int temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                
            }
        }  
        // --------------------------------------------------------------------------------------------
        System.out.println("\nThe three largest elements are: ");
        for(int i=0;i<3;i++){
            System.out.print(numbers[i]+" ");
        }

    }

}