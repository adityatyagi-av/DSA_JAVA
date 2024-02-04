package staticExample;

import java.util.Scanner;

public class innerClasses {
    static class Test{
        static int a;

        public Test(int b){
            Test.a=b;
        }
        static{
            a=444;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Test A= new Test(23);
        System.out.println(Test.a);
    }
}
