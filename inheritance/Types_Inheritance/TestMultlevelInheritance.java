package Types_Inheritance;
class Person{
    public void display(){
        System.out.println("this is super class");
    }
}
class Employee extends Person{
    public void show(){
    System.out.println("this is  sub class");
    }
}

class Manager extends Employee{
    public void shows(){
    System.out.println("this is sub of  sub class");
    }
}

public class TestMultlevelInheritance {
    public static void main(String args[]){
        Employee obj1=new Employee();
        obj1.display();
        obj1.show();
        Manager mn=new Manager();
        mn.shows();

    }
}
