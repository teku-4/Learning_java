import java.util.Scanner;
abstract class Remote{
    abstract void turnON();
    abstract void turnOFF();
}

class TvRemotes extends Remote{
  @Override
  void turnON(){
    System.out.println("TV is Turned ON. you can see what you wish to see now!");
  }
  @Override
  void turnOFF(){
    System.out.println("TV is turned OFF. what is wrong with in it? ");
  }
  void menu(){
    System.out.println("\n=== TV Remote Menu ===");
    System.out.println("press 1) to turn ON:");
    System.out.println("press 0) to turn OFF:");
    System.out.println("press -1) to log out:");
    
  }
}

public class TVRemote {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    TvRemotes rem1=new TvRemotes();
    while(true){
        rem1.menu();
        System.out.print("Enter  your choice from the above: ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
              rem1.turnON();
              break;
            case 0:
            rem1.turnOFF();
            break;
            case -1:
            System.out.println("Logging out... Goodbye!");
            return;
            default:
            System.out.println("Invalid choice. Please try again.");


        }
        
        
    }
  }  
}
