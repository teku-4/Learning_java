
import java.util.Scanner;
class Shape{
   
    void calculateArae(int width,int length){
    System.out.println("Area: "+(width*length));      
    }
}
class Rectangle extends Shape{
    void calculateArae(int width , int length){
        System.out.println("Rectangle area: "+(width*length));
    }
 void getParentArea(int length,int width){
         super.calculateArae(length,width);
    }
}

public class AreaMainClass {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Rectangle rec1=new Rectangle();
        System.out.println("Enter length ");
        int length=sc.nextInt();
        System.out.println("Enter width ");
        int width=sc.nextInt();
        rec1.calculateArae(width, length);

        
    }
}
