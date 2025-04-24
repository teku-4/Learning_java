class vehicle{
    vehicle(){
        System.out.println("Parent class");
    }
}
class car extends vehicle{
    car(){
        System.out.println("child class");
    }
}
public class TestSuper {
    public static void main(String args[]){

        car obj1=new car();
        
    }
    
}
