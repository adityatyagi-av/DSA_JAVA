import java.util.Arrays;

public class sieveoferastosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean [] primes= new boolean[n+1];
        sieve(40,primes);
        System.out.println(Arrays.toString(primes));
    }
    static void sieve(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+ " ");
            }
        }
    }
}
