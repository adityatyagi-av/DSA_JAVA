import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LearnHashmap {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        map.put(21,list);
        list.add(23);
        
//        map.put(1,"vashu");
        System.out.println(map);
        if(map.containsKey(1)){
            System.out.println(map.get(1));
        }
//        map.put(1,"tyagi");
        System.out.println(map);
    }
}
