class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    
    void sound(){
        System.out.println("Dog \"barks\"");
    }
}
class  Cat extends Animal{
  
    void sound(){
        System.out.println("Cat  \"meows\"");
    }
}

public class Overriedings {
    public static void main(String args[]){
        Dog dg=new Dog();
        Cat cat=new Cat();
        dg.sound();
        cat.sound();
    }
}
