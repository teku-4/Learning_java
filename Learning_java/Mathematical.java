public class Mathematical {
    public static void main(String[] args){
       int number2=23;
       int  number1=34;
    //    --min-max  and range value----------------------------------------
        int maximum=Math.max(number1,number2);
        int minimum=Math.min(number1,number2);
        double squareRoot=Math.sqrt(81);
        double power=Math.pow(number1,2);
        double absoluteValue=Math.abs(-98);
        int randoumNumber=(int)(Math.random()*11);
        double roundNumber=99.98787654578;
        double rounded=Math.round(roundNumber);
        System.out.printf("the max is : %d%n",maximum);

        System.out.printf("the min is : %d%n",minimum);
        
        System.out.printf("the square root of 81 is : %f%n",squareRoot);
        
        System.out.printf("the power of 23 is : %f%n",power);
        
        System.out.printf("the absolute value of -98 is : %f%n",absoluteValue);
        
        System.out.printf("the radoum number of 0 and 10 is : %d%n",randoumNumber);
        
        System.out.printf("the round number is : %f%n",rounded);

    }
}
