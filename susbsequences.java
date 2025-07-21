public class susbsequences {
    public static void subseq( int idx ,String str , String newString  ){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // if aana hai
        subseq(idx+1, str, newString+currChar);

        // if nhi aaana hai !
        subseq(idx+1, str, newString);

        
    }
    public static void main(String[] args) {
        String str = "abc";
        subseq(0, str, "");
    }
}
