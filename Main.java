public class Main{
    String classAttribute="this is class attribute";
    final String constantClassAttribute="this privented to modify with in object";
    static void displayGreeting(){
        System.out.println("Welcome to java  object oreinted");
    }
    public void publicmethode(){
        System.out.println("This is public methode accessed  by object only.");
    }
   static void staticMethod(){
    System.out.println("This is static methode accessed without object.");
   } 
    static void main(String[] args){
 displayGreeting();
 staticMethod();
 Main obj=new Main();
 obj.publicmethode();
 System.out.println(obj.classAttribute);
//  modication oclass attribute---------------------------------
 obj.classAttribute="This is modified class attribute";
 System.out.println(obj.classAttribute);
 // modification of final class attribute---------------------------------
//  obj.constantClassAttribute="This is modified class attribute";
 System.out.println(obj.constantClassAttribute);
}}