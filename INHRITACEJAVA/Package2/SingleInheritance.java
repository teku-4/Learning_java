class SupperClass{
    public void  ShowPMethode(){
        System.out.println("This is parent class ");
    }
}

class Subclass extends SupperClass{
public  void ShowChildMethodes(){
    System.out.println("This is Subclass methode");
}
}

public class SingleInheritance {
   public static void main(String args[]){
   Subclass obj1=new Subclass();
   obj1.ShowPMethode();
   obj1.ShowChildMethodes();
   }
}
