
class Student{
   private String name;
   
   String  getName(){
    return this.name;
   }
   void setName(String name){
    this.name=name;
   }}

public class Test {
    public static void main(String args[]){
        Student stud=new Student();
        stud.setName("Melona");
        System.out.println("Name : "+stud.getName());
    }
    
}
