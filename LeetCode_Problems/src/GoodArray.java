//import java.util.Scanner;
//
//public class GoodArray
//{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] arr={};
//
//        int size=scan.nextInt();
//        int target= scan.nextInt();
//        for(int i=0;i<size;i++){
//            arr[i]=scan.nextInt();
//        }
//        int p1=0;
//        int p2=1;
//        int count=0;
//        while(p2<=arr.length-1){
//            if(((arr[p1]-arr[p2])==target) ||((arr[p1]-arr[p2])==-target)){
//                count++;
//                p1++;
//                p2++;
//                continue;
//
//            }
//            else{
//                p1++;
//                p2++;
//            }
//        }
//        return count;
//    }
//
//    }
