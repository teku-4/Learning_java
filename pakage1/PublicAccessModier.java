package pakage1;

public class PublicAccessModier {
    String publicAccess="this is public access it can be accessed in other pakage";
    public static void main(String[] args){
        PublicAccessModier obj=new PublicAccessModier();
        System.out.println(obj.publicAccess);
    }
    
}
