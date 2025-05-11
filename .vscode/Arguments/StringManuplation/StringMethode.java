package StringManuplation;
import java.util.Scanner;
public class StringMethode {
 public  static void main(String args[]){
 Scanner sc=new Scanner(System.in);
    String text;
 System.out.println("Enter the text");
 text=sc.nextLine().trim();
 int count=1;
 String s1="letakasahun";
 for(int i=0;i<text.length();i++){
    if(text.charAt(i)==' ')count++;
}
 System.out.println("the text you entered is contains: "+text.length()+" charcters. And "+count+" words.");
 System.out.println("Sub string: "+text.substring(2,10).toUpperCase()); 
 System.out.println("Enter the username:");
 String userNmae=sc.nextLine().trim().toLowerCase();
 if(s1.equals(userNmae)) System.out.println("Successfuly mathch"); 

 if(userNmae.startsWith("leta")){
 System.out.println("your name is starts with: "+userNmae.substring(0,1).toUpperCase());
 }
 System.out.println(text.contains("hellow")?"yes i got":"No it is bad");
System.out.println(27.9%6);
/** this is documentation commment */
System.out.println(5+"5"+5);
int x=5;
System.out.println(x++ + ++x);
System.out.println(010);
System.out.println(10/3);
System.out.println(10.0/3);
System.out.println(050);

}  
}
