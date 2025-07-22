import java.util.HashSet;
public class susbsequences {
    public static void subseq( int idx ,String str , String newString , HashSet set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            } else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // if aana hai
        subseq(idx+1, str, newString+currChar , set);

        // if nhi aaana hai !
        subseq(idx+1, str, newString , set);

        
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subseq(0, str, "", set);
    }
}
