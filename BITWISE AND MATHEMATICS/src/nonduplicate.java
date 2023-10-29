import java.util.Scanner;

public class nonduplicate {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int result=0;
        int[] arr={1,2,4,3,5,2,3,1,5};
        for(int i=0;i<=arr.length-1;i++){
            result=result^arr[i];
        }
        System.out.println(result);

    }

}