import java.util.ArrayList;
import java.util.List;

public class findPrimes {
    public static void main(String[] args) {
        List arr=findPrimes(23);
        System.out.println(arr);
    }
    public static List<Integer> findPrimes(int number){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<=number;i++)
            if(i==0 || i==1){
                continue;
            }
            else if(i==2 || i==3){
                arr.add(i);
            }
            else if(i%2==0 || i%3==0){
                continue;
            }
            else{
               if(checkPrime(i)){
                   arr.add(i);
               }
            }
        return arr;
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
