package LAB_EXERCISE;
class Dog{
    String color;
    String name;
    Dog(String name,String color){
        this.name=name;
        this.color=color;

    }
     void display(){
       System.out.println("Name: "+name+"\nColor: "+color);

    }
}

public class ClassDog {
    public static void main(String args[]){
        Dog ob1=new Dog("Puppy", "White");
        ob1.display();
    }
    
}
