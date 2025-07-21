public class Revers {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("MAANG");

        for (int i =0; i<sb.length()/2; i++){ // traversing  helf of leangth.
            
            int frnt = i;
            int bck = sb.length()-1-i; //removing char's form last and first.

            char frntChar = sb.charAt(frnt); // converting int value into character value.
            char bckChar = sb.charAt(bck); // same as first 

            sb.setCharAt(bck, frntChar); // swaping chars frount to back.
            sb.setCharAt(frnt, bckChar); // swaping chars  Back to forunt.
        }
        System.out.println(sb); // printing final output
    }
}
 
