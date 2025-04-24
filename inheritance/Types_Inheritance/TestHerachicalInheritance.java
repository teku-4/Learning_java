package Types_Inheritance;
class Animal{
  void shows(){
        System.out.println("this is Animal class");

    }
}
class Dog extends Animal{
 void shows(){
    System.out.println("The dog says woof!");
 }
}
class Cat extends Animal{
    void shows(){
        System.out.println("cat says miw!");
    }
}
public class TestHerachicalInheritance {
    public static void main(String args[]){
        Dog dog1=new Dog();
        Cat cat1=new Cat();
        dog1.shows();
        cat1.shows();

    }
    
}
