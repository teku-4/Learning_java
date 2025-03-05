
public class ArrayInJava {
    public static void main(String[] args) {
       // --------------------------------------------------------------------------------
       System.out.println("This is java array tutorial");
   //difine with in square bracket frist and then in curl brace-------------------------------------
       String[] fruits={"Banana","Avocado","Chery","Mango"};
       System.out.println(fruits);
       // ---array modification
       fruits[2]="Apple";
       System.out.println(fruits[2]);
       for(int i=0; i < fruits.length;i++){
        System.out.printf(" %2s ",fruits[i]);
       }
   // looping throughout array using for-each loop
   for(String j : fruits){
       System.out.println(j);
   }
   // array in real world example to calculate sum and averages og marks
   double[] marks={97,98,99,94,95};
   int lengths=marks.length;
   double sum=0, average;
   for(double mark :  marks)
   {
       sum += mark;
   }
   average=sum/lengths;
   String formatedAvg=String.format("%.2f", average);
   String formatedTotal=String.format("%.2f",sum);
   System.out.printf("tota: %2s  avarege: %2s%n",formatedTotal,formatedAvg);
   // the lowest mrks is____________________________
   double lowestMark=marks[0];
   double heighestMark=marks[0];
   for( double mrk:marks){
       if(lowestMark>mrk){
           lowestMark=mrk;
       }

   }
   for(double mrkh:marks)
   {
       if(heighestMark<mrkh){
           heighestMark=mrkh;
       }
   }
   int rangesMark=(int)(heighestMark-lowestMark);
   System.out.printf("heighest: %2f lowest: %2f  range: %2d%n",heighestMark,lowestMark,rangesMark);
   }
}