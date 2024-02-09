package accessmodifiers;

public class Main {
    public static void main(String[] args){
        A a =new A(3,5,23,2);
        System.out.println(a.getA2());
        a.getValues();
        System.out.println(a);
        B b=new B(1,2,3,4,5,6,7,8);
        b.showAData();
        C c =new C(1,2,3,4,5,6,7,8,9,10,11,12);

    }
}
