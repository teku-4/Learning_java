class Animal{
    void makeSound(){
        System.out.println("Animale make sound");
    }
}
class Cat extends Animal{
    void makeSound(){
        super.makeSound();
        System.out.println("Cat make sound like Miw");
    }
}

public class ClassAnimal {
   public static void main(String args[]){
    Cat cat1=new Cat();
    cat1.makeSound();
   }
    
}
