package HomeWork;
class Exam{
    int num;
    String name;
    Exam(){
        System.out.println("this is java programm");
    }
}
public class constractor {
    public static void main(String args[]){
        Exam ob1=new Exam();
        // ob1.num=12;
        System.out.println(ob1.num);
        
        System.out.println(ob1.name);
    }
    
}
