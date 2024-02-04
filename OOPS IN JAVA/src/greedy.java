import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greedy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the size of array");
        int n= input.nextInt();
        int[] start_time=new int[n];
        int[] finish_time=new int[n];
        List<Integer> output1=new ArrayList<Integer>();

        System.out.println("Enter the elements of first array");
        for(int i=0;i<n;i++){
            start_time[i]= input.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for(int i=0;i<n;i++){
            finish_time[i]= input.nextInt();
        }
        output1=Activity_Selection(n,start_time,finish_time);

    }
    public static List<Integer> Activity_Selection(int n,int[] start_time,int[] finish_time){
        ArrayList<Integer> total=new ArrayList<Integer>();
        int no=1;
        for(int i=1;i<n;i++){
            if(finish_time[no]<start_time[i+1]){
                total.add(i);
                no=i+1;
            }
            else{
                continue;
            }
        }
        return total;
    }
}

