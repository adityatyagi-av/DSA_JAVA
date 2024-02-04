public class powerof2 {
    public static void main(String[] args) {
        int n=16;
        int ans=n&(n-1);
        if(ans==0){
            System.out.println("power of 2");

        }
        else{
            System.out.println("not power of 2");
        }
    }
}
