
public class VarArgs {
    
static void Add(int... num){
    int sum=0;
    for(int i:num){
        sum+=i;

    }
    System.out.println("Sum: "+sum);
}
public static void main(String args[]){
    
    // VarArgs ob1=new VarArgs();
    Add(10,20,90);
    Add(10,10,10,20,40,20,40,60);
}



}
