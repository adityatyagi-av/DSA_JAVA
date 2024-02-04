public class oneton {
    public static void main(String[] args) {
        ntoone(5);
    }
    public static void ntoone(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        ntoone(n-1);
    }
}

