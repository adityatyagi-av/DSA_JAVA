package staticExample;


//this is a demo to show initialisation of static variable
public class staticBlock {
    static int a =4;
    static int b;
    static{
        System.out.println("static block initialized");
        b=a*5;
    }
    public static void main(String[] args){
        System.out.println(staticBlock.a + " "+ staticBlock.b +4 );
        staticBlock.b +=3;
        staticBlock.b +=3;
        staticBlock.b +=3;

        System.out.println(staticBlock.a + " "+ staticBlock.b );

    }
}
