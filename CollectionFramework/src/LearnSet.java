import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> set= new TreeSet<>();
//        set.add(32);
//        System.out.println(set);
//        set.add(12);
//        System.out.println(set);
//
//        set.add(65);
//        System.out.println(set);
//        set.add(76);
//        System.out.println(set);
//        set.add(21);
//        System.out.println(set);
//        set.add(21);
//        set.add(21);
//        System.out.println(set);
//        set.add(21);
//        System.out.println(set);
//        set.remove(54);
//
//        System.out.println(set.contains(12));
        
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(new Student("Aditya",1));
        studentSet.add(new Student("Aditya",1));

        System.out.println(studentSet.toString());
    }
}
