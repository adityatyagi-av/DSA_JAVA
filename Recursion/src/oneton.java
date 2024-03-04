import java.lang.reflect.Array;
import java.util.ArrayList;

public class oneton {
    public static void main(String[] args) {
        ArrayList<Integer> newlist=new ArrayList<>();
        newlist.add(2);
        newlist.add(3);
        System.out.println('a'+newlist.toString());
    }
    public static void ntoone(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        ntoone(n-1);
    }
}

