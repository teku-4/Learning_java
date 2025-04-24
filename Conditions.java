import java.util.Scanner;

public class Conditions {
    public static void main(String[] args)
    {
Scanner input=new Scanner(System.in);

// int age;
// System.out.println("How old are you ?");
// age=input.nextInt();

// if(age <= 18){
//     System.out.println("you are too child to vote and to be elected: " );
//    }   else if (age >= 18 && age <21){
//         System.out.println("you can vote but you are still too child to be elected: ");

//     }
//     else if (age >=21){
//         System.out.println("your age is enough to vote and also to be elected:");

//     }
//     else{
//         System.out.println("age must be positive ");

// }
// int time;
// System.out.println("what time is it ?");
// time=input.nextInt();
// input.nextLine();
// System.out.println("what is your name ?");
// String name=input.nextLine();
// if(time>=0 && time <= 6){
//     System.out.println("Good morning: "+name);
// }
// else if (time <=10 && time >=7){
//     System.out.println("Good day "+name);
// }
// else if(time <= 14 && time >=11){
//     System.out.println("Good evining "+name);
// }
// else if(time >=15 && time <= 23){
//     System.out.println("Good night "+name);
// }
// else{
//     System.out.println("it is wrong input because tme must be positive ");
// }
// calculating the grade using shor hand method of ternery oprators
// grading system---------------------------------------------------------
// System.out.println("Enter your mark ");
// double mark=input.nextDouble();
// char grade = (mark <= 100 && mark >=85)? 'A': (mark >= 70)?'B':(mark>=60)?'C':(mark>=50)?'D':(mark>=0)?'F':'P';
// System.out.println("grade is " + grade);


// ---chek week day in java using switchs--------------------------------------------
System.out.println("Enter the day of week ");
String day=input.nextLine().toLowerCase();
switch (day) {
    case "sunday":
        System.out.println("to day is SUNDAY let us go church");
        break;
    case "monday":
        System.out.println("to day is monday let\'s go school");
        break;
    case "tusday":
        System.out.println("to day is tusday we hae exam at 3:00 o\'clock ");
        break;
    case "wednsday":
     System.out.println("to day is wednsday let\'s take exam");
     break;
     default:
      System.out.println("wrong input ");
}

input.close();
    }
}
