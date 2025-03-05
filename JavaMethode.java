package methodes;
import java.util.Scanner;
public class JavaMethode {
    // // ---methode to display welcome to java methode
    // static void myMethode(){
    //     System.out.println(" welcome to this is methode of java.");

    // }
    // // ---methode display fulname in java---------------------------
    // static void displayFulName(String fristName,String lastName){

    //     System.out.printf("frist name: %s last name: %s%n",fristName,lastName);
    // }
    // // --methodes of authenticate user-----------------------------------
    // static void authenticateUser(String userName,String password){
    //     if(userName == "le" && password == "leta123"){
    //         System.out.println("Welcome you are grated as you succesfuly authenticated!");

    //     }
    //     else{
    //         System.out.println("Invalid credential please enter the valid username or pasword!");
    //     }
    // }
    // returning value methode in java-calculate area of different shape---------------------------------------------
     static void mainMenu(){
        System.out.println("press 1 to calculate the area of circle: ");
        
        System.out.println("press 2 to calculate the area of rectangle: ");
        
        System.out.println("press 3 to calculate the area of triangle: ");
        
        System.out.println("press 4 to calculate the area of Square: ");
        
        System.out.println("press 0 to exit:  ");

     }
    //  formating the result fuction
    public static String formatNumber(double number){
        return String.format("%.2f",number);
    }   
    public static void  calculateCircleArea(float raduis){
        double  area=Math.PI*Math.pow(raduis,2);
        System.out.println("circle area: "+ formatNumber(area));
        
     }
   public static void calculateRectArea(float width, float lengthrec){
    double area=width*lengthrec;
    System.out.println("rectangle area:  "+formatNumber(area));

   }
   public static void calculatetriangArea(float hieght,float base){
   double Area=hieght*base;
   System.out.println("Triangle Area: "+formatNumber(Area));
   }
   public static void calculateSquareArea(float Slength){
    double Area=Math.pow(Slength,2);
    System.out.println("Square Area: "+formatNumber(Area));
   }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        // myMethode();
        // String fristName="Leta";
        // String lastName="Kasahun";
        // displayFulName(fristName,lastName);
        // String username,password;
        // System.out.print("username: ");
        // username=input.nextLine().toLowerCase().trim();
      
        // System.out.print("Password: ");
        // password=input.nextLine().trim();
        // authenticateUser(username, password);
        mainMenu();
        int option;
        System.out.println("Enter your option from the main menu:");
        option=input.nextInt();
        while (option!=0)
        {
            switch (option) {
                case 1:
                   float raduis;
                   System.out.println("Enter the raduis: ");
                   raduis=input.nextFloat();
                   calculateCircleArea(raduis);
                   mainMenu();
                   break;
                case 2:
                    float lengths,width;
                    System.out.println("Enter the length: ");
                    lengths=input.nextFloat();
                    System.out.println("Enter the width: ");
                    width=input.nextFloat();
                    calculateRectArea(width,lengths);
                    mainMenu();
                    break;
                case 3:
                    float heights,bases;
                    System.out.println("Enter the height: ");
                    heights=input.nextFloat();
                    System.out.println("Enter the base: ");
                    bases=input.nextFloat();
                    calculatetriangArea(heights,bases);
                    mainMenu();
                    break;
                case 4:
                    float sqlength;
                    System.out.println("Enter the length: ");
                    sqlength=input.nextFloat();

                    calculateSquareArea(sqlength);
                    mainMenu();
                    break;      
                        
                default:
                 System.out.println("wrong input");
                    break;
            }
        }
        input.close();
    }
}
