public class Recursion_RemoveDuplicate {
    public static void removeDuplicateChar(String str,int idx,StringBuilder newStr,boolean map[]){
        //base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam or logic
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicateChar(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicateChar(str,idx+1,newStr.append(currChar),map);
        }

    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicateChar(str,0,new StringBuilder(""),new boolean[26]);
    }
}
