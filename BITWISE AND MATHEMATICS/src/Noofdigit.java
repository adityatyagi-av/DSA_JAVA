public class Noofdigit {
    public static void main(String[] args) {
        int n=1241242;
        int base=10;
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
