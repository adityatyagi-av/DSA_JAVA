import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,4,56,34,232,12};
        runningSum(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void runningSum(int[] nums) {
        for(int i=1;i<=nums.length-1;i++){
            nums[i]=nums[i]+nums[i-1];
        }
    }
}