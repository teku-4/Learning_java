import java.util.Scanner;
class Student{
    String name;
    int id;
    int age;
    void displayStudet(){
        System.out.println("Name: "+this.name+" Age: "+this.age+" Id: "+this.id);
    }
}
class Exam extends Student{
    int sub1;
    int sub2;
    int sub3;
    void displayMark(){
        double avg=(sub1+sub2+sub3)/3;
        System.out.print("Mark osf sub1"+sub1+"  mark of sub2: "+sub2+" marks of sub3: "+sub3);
        System.out.println("avarage is : "+avg);
    }
}
public class Students {
    public static void main(String args[]){
        Student stud1=new Student();
        Exam  stud2=new Exam();
        Scanner sc=new Scanner(System.in);
             
             System.out.println("Enter name");
             stud1.name=sc.nextLine();
             System.out.println("Enter age");
             stud1.age=sc.nextInt();
             System.out.println("Enter Id");
             stud1.id=sc.nextInt();
             System.out.println("Enter mark of sub1");
             stud2.sub1=sc.nextInt();
             System.out.println("Enter mark of sub2");
             stud2.sub2=sc.nextInt();
             System.out.println("Enter mark of sub3");
             stud2.sub3=sc.nextInt();
             stud1.displayStudet();
             stud2.displayMark();
             
    }
    
}
