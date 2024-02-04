public class minimumOperations {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        int totalOperations=minOperations(logs);
        System.out.println(totalOperations);
    }
    public static int minOperations(String[] logs) {
        int i=0;
        int count=0;
        while(i<=logs.length-1){
            switch(logs[i]){
                case "../":
                    if(count==0){
                        i++;
                        break;
                    }
                    else{
                    count--;
                    i++;
                    break;
                    }

                case "./":
                    i++;
                    break;
                default:
                    count++;
                    i++;
            }
        }
        return count;
    }
}

