import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int value= input.nextInt();
        if((value&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}