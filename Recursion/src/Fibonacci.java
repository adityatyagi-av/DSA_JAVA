public class Fibonacci {
    public static void main(String[] args) {

    }
    static int fibo(int n,int start1,int start2){
        if(n<2){
          if(n==0){
              return start1;
          }
          else{
              return start2;
          }
        }
        return fibo(n-1,start1,start2)+fibo(n-2,start1,start2);
    }
}
