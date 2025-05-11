package Types_Inheritance;
class Person{
    void display(){
        System.out.println("The parent class");
    }
}
class Student extends Person{
    void display(){
        System.out.println("this is child class");
        super.display();
    }
}
public class TestSingleInheritance {
    public static void main(String args[]){
        Student stud1=new Student();
        stud1.display();

    }
    
}
