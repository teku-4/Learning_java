package methodes;

public class JMOverLoading {
    public static int addnumbers(int num1){
        return num1+34;
    }
    public static int addnumbers(int num1,int num2){
        return num1+num2;
    }
    public static double addnumbers(double num1){
        return num1+56.5;
    }
    public static double addnumbers(double num1, double num2){
    return num1 + num2;}
    public static void main(String[] args){
        int result1=addnumbers(10);
        int result2=addnumbers(12,34);
        double resultd1=addnumbers(20.5);
        double resultd2=addnumbers(35.4,56.7);
        System.out.printf("%2d - %2d - %2f - %2f%n ",result1,result2,resultd1,resultd2);

    }
}
