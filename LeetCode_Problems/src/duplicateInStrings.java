//public class duplicateInStrings {
//    public static void main(String[] args) {
//        String str="wggaabbc";
//        String newStr=removeDuplicates(str);
//        System.out.println(newStr);
//    }
//    public static String removeDuplicates(String s) {
//        StringBuilder str=new StringBuilder(s);
//        int i=0;
//        int j=1;
//        while(i!=j){
//            if(str.charAt(i)==str.charAt(j)){
//                str.delete(i,j);
//                if(i>0){
//                    i--;
//                    j--;
//                }
//            }
//            else{
//                if(str.charAt(j)==null){
//                    i++;
//                    j++;
//                }
//                else{
//                    i++;
//                }
//
//            }
//        }
//        return str.toString();
//    }
//}
