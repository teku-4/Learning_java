public class JavaConstractor {
    int age;
    // --deult constractors--------------------------
    public JavaConstractor() {
        age=21;
}

    // --parameterized constractor--------------------------}
    public JavaConstractor(int agePara) {
        age = agePara;
    }
    static  void main(String[] args){
        JavaConstractor obj1 = new JavaConstractor();
        System.out.println("obj1's age: "+obj1.age);
        JavaConstractor obj2=new JavaConstractor(22);
        System.out.println("parametrized age: "+obj2.age);
    }
}
