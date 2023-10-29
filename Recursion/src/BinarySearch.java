public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,352,653,1222,6456,3254};
        int target=27;
        int binarySearchResult=BinarySearch(arr,0,arr.length,target);
        System.out.println(binarySearchResult);
    }
    public static int BinarySearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                return BinarySearch(arr,start,mid-1,target);
            }
            else if (arr[mid]<target){
                return BinarySearch(arr,mid+1,end,target);
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
