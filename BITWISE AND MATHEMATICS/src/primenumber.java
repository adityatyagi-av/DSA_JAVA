public class primenumber {
    public static void main(String[] args) {
    int num=29;
    boolean checkPrime=findprime(num);
        System.out.println(checkPrime);
    }
    public static boolean findprime(int number){
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
            else{
                continue;
            }
        }
        return true;
    }
}
