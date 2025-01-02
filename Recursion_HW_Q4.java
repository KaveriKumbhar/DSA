public class Recursion_HW_Q4 {
    public static void subStringSame(String str,int start,int end){
        if(start ==str.length() || end == str.length()){
            return;
        }
        if(str.charAt(start) == str.charAt(end)){
            System.out.println(str.substring(start, end));
        }
        subStringSame(str,start+1, end+1);

    }
    public static void main(String[] args) {
        String str = "abcab";

        subStringSame(str, 1, 1);
    }
}
