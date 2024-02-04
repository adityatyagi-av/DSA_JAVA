public class squareroot {
    public static void main(String[] args) {
        int n=40;
        int sqrroot=squareroot(n);
        System.out.println(sqrroot);
    }
    public static int squareroot(int n){

       int start=0;
       int end=n;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(mid*mid>n){
               end =mid-1;
           } else if (mid*mid<n) {
               start=mid+1;
           }
           else{
               return mid;
           }
       }
       return -1;
    };
}
