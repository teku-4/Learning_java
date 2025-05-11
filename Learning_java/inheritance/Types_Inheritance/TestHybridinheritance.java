package Types_Inheritance;
class Person{
    public void display(){
        System.out.println("this is super class");
    }
}
class Employee extends Person{
    public void show(){
    System.out.println("this is  employee class");
    }
}

class Manager extends Employee{
    public void shows(){
    System.out.println("this is manger class");
    }
}
class Teacher extends Employee{
    public void showss(){
        System.out.println("this is teacher class");
        }
}
public class TestHybridinheritance {
    public static void main(String args[]){
        
    Teacher t1=new Teacher();
    t1.showss();
    Manager mng=new Manager();
    mng.show();
    
    }
}
