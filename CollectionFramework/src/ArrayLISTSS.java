import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ArrayLISTSS {
    public static void main(String[] args) {
//        ArrayList<String> studentName=new ArrayList<>();
//        List<Integer> list=new ArrayList<>();
//        list.add(23);
//
//        list.add(1,22);
//        list.add(2,30);
//        list.add(3,4);
//        list.add(1,30);
//        list.add(4,3112);
//        System.out.println(list);
//
//        List<Integer> newList=new ArrayList<>();
//        newList.add(12);
//        newList.add(34432);
//
//        list.addAll(newList);
//        System.out.println(list);
//        System.out.println(list.remove(Integer.valueOf(30)));
//        System.out.println(list);
////        list.clear();
////        System.out.println(list);
//        System.out.println(list.size());
//        list.removeAll(newList);
//        System.out.println(list.get(4));
//         list.set(1,25);
//        System.out.println(list);
//
//        System.out.println(list.contains(22));
//        Iterator<Integer> it=list.iterator();
//        while(it.hasNext()){
//            System.out.println("iterator"+it.next());
//        }

        Stack<String> animals=new Stack<>();
         animals.push("lion");
         animals.push("tiger");
         animals.push("leopard");
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals.peek());
        System.out.println(animals.empty());
        System.out.println(animals.search("tiger"));
    }
}
