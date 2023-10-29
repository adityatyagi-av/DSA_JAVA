public class ithbit {
    public static void main(String[] args) {
    int num=54;
        System.out.println(findithbit(num));
    }
    public static int findithbit(int number){
        int value=0;
        value=number^10000;

        return value;
    };
}
